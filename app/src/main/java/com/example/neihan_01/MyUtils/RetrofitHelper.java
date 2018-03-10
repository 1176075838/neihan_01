package com.example.neihan_01.MyUtils;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 大金鑫 on 2018/1/10.
 */

public class RetrofitHelper {
    public static Retrofit retrofit;
    public static Retrofit getRetrofit(String url) {
        if (retrofit == null) {
            synchronized (RetrofitHelper.class) {
                if (retrofit == null) {
                    OkHttpClient client = new OkHttpClient.Builder()
                            .addInterceptor(new CommonParamsInterceptor())
                            .build();
                    retrofit = new Retrofit.Builder()
                            .baseUrl(My_Urls.HTTP)
                            .client(client)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .build();
                }
            }
        }
        return retrofit;
    }
}
