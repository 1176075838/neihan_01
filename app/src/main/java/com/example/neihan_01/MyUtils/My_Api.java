package com.example.neihan_01.MyUtils;

import com.example.neihan_01.Bean.TuiJian_Bean;
import com.example.neihan_01.Bean.ZhongBean;
import com.example.neihan_01.Bean.ZhongTwo_Bean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;



/**
 * Created by 大金鑫 on 2018/1/10.
 */

public interface My_Api {
    @GET("neihan/stream/mix/v1/")
    Observable<ZhongBean<ZhongTwo_Bean<TuiJian_Bean>>> getTuiJian(@Query("content_type") String content_type);
}
