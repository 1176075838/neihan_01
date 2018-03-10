package com.example.neihan_01;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.neihan_01.Fragment.Frag_TuiJian;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tl;
    private ViewPager vp;
    private List<String> datas = new ArrayList<String>();
    private List<String> list=new ArrayList<>();

//第一次使用
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tl = (TabLayout) findViewById(R.id.tl);
        vp = (ViewPager) findViewById(R.id.vp);
        datas.add("推荐");
        datas.add("视频");
        datas.add("图片");
        datas.add("段子");
        list.add("-101");
        list.add("-104");
        list.add("-103");
        list.add("-102");
        vp.setAdapter(new MyAdapter(getSupportFragmentManager()));
        //进行关联
        tl.setupWithViewPager(vp);
    }
    class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }
        //带参的构造方法
        @Override
        public int getCount() {
            return datas.size();
        }
        //返回选项卡的文本 ，，，添加选项卡
        @Override
        public CharSequence getPageTitle(int position) {
            return datas.get(position);
        }
        @Override
        public Fragment getItem(int position) {
            //创建fragment对象并返回
            Bundle bundle = new Bundle();
            bundle.putString("url", list.get(position));
            //实例化Fragment
            Frag_TuiJian frag_tuiJian = new Frag_TuiJian();
            frag_tuiJian.setArguments(bundle);
            return frag_tuiJian;
        }
    }
}