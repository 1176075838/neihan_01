package com.example.neihan_01.MVP_P;


import com.example.neihan_01.Bean.TuiJian_Bean;
import com.example.neihan_01.Bean.ZhongBean;
import com.example.neihan_01.Bean.ZhongTwo_Bean;
import com.example.neihan_01.MVP_M.TuiJian_Model;
import com.example.neihan_01.MVP_V.TuiJian_View;

public class TuiJian_Presenter implements TuiJian_P {
    private TuiJian_View tuiJian_view;
    private final TuiJian_Model tuiJian_model;

    public TuiJian_Presenter(TuiJian_View tuiJian_view){
          this.tuiJian_view=tuiJian_view;
        tuiJian_model = new TuiJian_Model();
    }
    public void getTuijian(String url){
         tuiJian_model.getTuiJian(url,this);
    }

    @Override
    public void onSuccess(ZhongBean<ZhongTwo_Bean<TuiJian_Bean>> arr) {
        tuiJian_view.onSuccess(arr);
    }

    @Override
    public void onFailure(String error) {
       tuiJian_view.onFailure(error);
    }
}
