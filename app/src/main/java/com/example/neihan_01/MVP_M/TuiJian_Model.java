package com.example.neihan_01.MVP_M;

import com.example.neihan_01.Bean.TuiJian_Bean;
import com.example.neihan_01.Bean.ZhongBean;
import com.example.neihan_01.Bean.ZhongTwo_Bean;
import com.example.neihan_01.MVP_P.TuiJian_P;
import com.example.neihan_01.MyUtils.My_Api;
import com.example.neihan_01.MyUtils.My_Urls;
import com.example.neihan_01.MyUtils.RetrofitHelper;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by 大金鑫 on 2018/1/10.
 */

public class TuiJian_Model {
    public void getTuiJian(String url, final TuiJian_P tuiJian_p){
        My_Api my_api = RetrofitHelper.getRetrofit(My_Urls.HTTP).create(My_Api.class);
        my_api.getTuiJian(url)
              .subscribeOn(Schedulers.io())
              .observeOn(AndroidSchedulers.mainThread())
              .subscribe(new Consumer<ZhongBean<ZhongTwo_Bean<TuiJian_Bean>>>() {
                  @Override
                  public void accept(ZhongBean<ZhongTwo_Bean<TuiJian_Bean>> zhongTwo_beanZhongBean) throws Exception {
                      String message = zhongTwo_beanZhongBean.getMessage();
                      if(message.equals("success")){
                          tuiJian_p.onSuccess(zhongTwo_beanZhongBean);
                      }else{
                          tuiJian_p.onFailure("请求失败");
                      }
                  }
              });
    }
}
