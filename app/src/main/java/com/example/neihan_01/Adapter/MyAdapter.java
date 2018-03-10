package com.example.neihan_01.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.neihan_01.Bean.TuiJian_Bean;
import com.example.neihan_01.Bean.ZhongBean;
import com.example.neihan_01.Bean.ZhongTwo_Bean;
import com.example.neihan_01.R;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private ZhongBean<ZhongTwo_Bean<TuiJian_Bean>> arr;
    private Context context;
    public MyAdapter(ZhongBean<ZhongTwo_Bean<TuiJian_Bean>> arr,Context context){
        this.arr=arr;
        this.context=context;
    }
    @Override
    public int getItemCount() {
        return arr.getData().getData().size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==0){
            View inflate = View.inflate(context, R.layout.shiping, null);
            MyViewHolder myViewHolder = new MyViewHolder(inflate);
            return myViewHolder;
        }else if(viewType==1){
            View inflate = View.inflate(context, R.layout.tupian, null);
            MyViewHolder2 myViewHolder2 = new MyViewHolder2(inflate);
            return myViewHolder2;
        }else{
            View inflate = View.inflate(context, R.layout.wenzi, null);
            MyViewHolder3 myViewHolder3 = new MyViewHolder3(inflate);
            return myViewHolder3;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if(holder instanceof MyViewHolder){
                MyViewHolder myViewHolder= (MyViewHolder) holder;
                String mp4_url = arr.getData().getData().get(position).getGroup().getMp4_url();
                if(mp4_url!=null){
                    TuiJian_Bean.GroupBean group = arr.getData().getData().get(position).getGroup();
                    GenericDraweeHierarchyBuilder builder = new GenericDraweeHierarchyBuilder(context.getResources());
                    RoundingParams roundingParams = RoundingParams.asCircle();
                    GenericDraweeHierarchy build = builder.setRoundingParams(roundingParams).build();
                    myViewHolder.spsim.setHierarchy(build);
                    myViewHolder.spsim.setImageURI(group.getUser().getAvatar_url());
                    myViewHolder.spname.setText(group.getUser().getName());
                    String content = arr.getData().getData().get(position).getGroup().getContent();
                    String content_name = arr.getData().getData().get(position).getGroup().getCategory_name();
                    int length = content_name.length();
                    SpannableString spannableString = new SpannableString("#"+content_name+"#           "+content);
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.RED);
                    spannableString.setSpan(foregroundColorSpan, 0, length+2, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
                    myViewHolder.content.setText(spannableString);
                    ViewGroup.LayoutParams layoutParams = myViewHolder.player.getLayoutParams();
                    int height = arr.getData().getData().get(position).getGroup().get_$360p_video().getHeight();
                    WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
                    Display display = wm.getDefaultDisplay();
                    layoutParams.width=display.getWidth();
                    layoutParams.height=height;
                    myViewHolder.player.setLayoutParams(layoutParams);
                    boolean setUp = myViewHolder.player.setUp(arr.getData().getData().get(position).getGroup().get_$360p_video().getUrl_list().get(0).getUrl(), JCVideoPlayer.SCREEN_LAYOUT_LIST, "内段段子");
                    if (setUp) {
                        if(arr.getData().getData().get(position).getGroup().getLarge_cover()!=null){
                            Glide.with(context).load(arr.getData().getData().get(position).getGroup().getLarge_cover().getUrl_list().get(0).getUrl()).into(myViewHolder.player.thumbImageView);
                        }
                    }
                }
            }
            if(holder instanceof MyViewHolder2){
                MyViewHolder2 myViewHolder2= (MyViewHolder2) holder;
                if(arr.getData().getData().get(position).getGroup().getLarge_image()!=null){
                    TuiJian_Bean.GroupBean group = arr.getData().getData().get(position).getGroup();
                    GenericDraweeHierarchyBuilder builder = new GenericDraweeHierarchyBuilder(context.getResources());
                    RoundingParams roundingParams = RoundingParams.asCircle();
                    GenericDraweeHierarchy build = builder.setRoundingParams(roundingParams).build();
                    myViewHolder2.spsim.setHierarchy(build);
                    myViewHolder2.spsim.setImageURI(group.getUser().getAvatar_url());
                    myViewHolder2.spname.setText(group.getUser().getName());
                    String content = arr.getData().getData().get(position).getGroup().getContent();
                    String content_name = arr.getData().getData().get(position).getGroup().getCategory_name();
                    int length = content_name.length();
                    SpannableString spannableString = new SpannableString("#"+content_name+"#           "+content);
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.RED);
                    spannableString.setSpan(foregroundColorSpan, 0, length+2, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
                    myViewHolder2.content.setText(spannableString);
                    int height = arr.getData().getData().get(position).getGroup().getLarge_image().getHeight();
                    ViewGroup.LayoutParams layoutParams1 = myViewHolder2.simple.getLayoutParams();
                    WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
                    Display display = wm.getDefaultDisplay();
                    layoutParams1.width=display.getWidth();
                    layoutParams1.height=height;
                    myViewHolder2.simple.setLayoutParams(layoutParams1);
                    String url = arr.getData().getData().get(position).getGroup().getLarge_image().getUrl_list().get(0).getUrl();
                    Glide.with(context).load(url).into(myViewHolder2.simple);
                }
            }
            if(holder instanceof MyViewHolder3){
                   MyViewHolder3  myViewHolder3= (MyViewHolder3) holder;
                TuiJian_Bean.GroupBean group = arr.getData().getData().get(position).getGroup();
                GenericDraweeHierarchyBuilder builder = new GenericDraweeHierarchyBuilder(context.getResources());
                RoundingParams roundingParams = RoundingParams.asCircle();
                GenericDraweeHierarchy build = builder.setRoundingParams(roundingParams).build();
                myViewHolder3.spsim.setHierarchy(build);
                myViewHolder3.spsim.setImageURI(group.getUser().getAvatar_url());
                myViewHolder3.spname.setText(group.getUser().getName());
                String content = arr.getData().getData().get(position).getGroup().getContent();
                String content_name = arr.getData().getData().get(position).getGroup().getCategory_name();
                int length = content_name.length();
                SpannableString spannableString = new SpannableString("#"+content_name+"#           "+content);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.RED);
                spannableString.setSpan(foregroundColorSpan, 0, length+2, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
                myViewHolder3.content.setText(spannableString);
            }
        }

    @Override
    public int getItemViewType(int position) {
        if (arr.getData().getData().get(position).getGroup().getMp4_url() !=null) {
            return 0;
        } else if (arr.getData().getData().get(position).getGroup().getLarge_image() !=null) {
            return 1;
        } else   {
            return 2;
        }
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        JCVideoPlayerStandard player;
        SimpleDraweeView spsim;
        TextView spname;
        TextView content;
        public MyViewHolder(View itemView) {
            super(itemView);

            player= (JCVideoPlayerStandard) itemView.findViewById(R.id.player_list_video);
            spsim = (SimpleDraweeView) itemView.findViewById(R.id.spsim);
            spname= (TextView) itemView.findViewById(R.id.spname);
             content = (TextView) itemView.findViewById(R.id.content);
        }
    }

    class MyViewHolder2 extends RecyclerView.ViewHolder {
        ImageView simple;
        SimpleDraweeView spsim;
        TextView spname;
        TextView content;
        public MyViewHolder2(View itemView) {
            super(itemView);
            spsim = (SimpleDraweeView) itemView.findViewById(R.id.spsim);
            spname= (TextView) itemView.findViewById(R.id.spname);
            content = (TextView) itemView.findViewById(R.id.content);
            simple= (ImageView) itemView.findViewById(R.id.simple);
        }
    }

    class MyViewHolder3 extends RecyclerView.ViewHolder {
        SimpleDraweeView spsim;
        TextView spname;
        TextView content;
        public MyViewHolder3(View itemView) {
            super(itemView);
            spsim = (SimpleDraweeView) itemView.findViewById(R.id.spsim);
            spname= (TextView) itemView.findViewById(R.id.spname);
            content = (TextView) itemView.findViewById(R.id.content);
        }
    }
}
