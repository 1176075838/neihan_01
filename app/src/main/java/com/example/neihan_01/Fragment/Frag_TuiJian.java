package com.example.neihan_01.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.neihan_01.Adapter.MyAdapter;
import com.example.neihan_01.Bean.TuiJian_Bean;
import com.example.neihan_01.Bean.ZhongBean;
import com.example.neihan_01.Bean.ZhongTwo_Bean;
import com.example.neihan_01.MVP_P.TuiJian_Presenter;
import com.example.neihan_01.MVP_V.TuiJian_View;
import com.example.neihan_01.R;
import com.example.neihan_01.RecycleViewDivider;
import com.jcodecraeer.xrecyclerview.XRecyclerView;


public class Frag_TuiJian extends Fragment implements TuiJian_View {
    private View view;
    private XRecyclerView xrecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.tuijian, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        xrecycler = (XRecyclerView) view.findViewById(R.id.xrecycler);
        Bundle bundle = getArguments();
        String url = bundle.getString("url").toString();
        Log.e("aaa","aaa"+url);
        TuiJian_Presenter tuiJian_presenter = new TuiJian_Presenter(this);
        tuiJian_presenter.getTuijian(url);
    }

    @Override
    public void onSuccess(ZhongBean<ZhongTwo_Bean<TuiJian_Bean>> arr) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        xrecycler.setLayoutManager(staggeredGridLayoutManager);
        MyAdapter myAdapter = new MyAdapter(arr,getActivity());
       //xrecycler.addItemDecoration(new SpaceItemDecoration(0));
        xrecycler.addItemDecoration(new RecycleViewDivider(
                getActivity(), LinearLayoutManager.VERTICAL, 10, getResources().getColor(R.color.colorPrimaryDark)));
        xrecycler.setAdapter(myAdapter);
    }

    @Override
    public void onFailure(String error) {

    }
}
