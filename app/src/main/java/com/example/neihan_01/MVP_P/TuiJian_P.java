package com.example.neihan_01.MVP_P;


import com.example.neihan_01.Bean.TuiJian_Bean;
import com.example.neihan_01.Bean.ZhongBean;
import com.example.neihan_01.Bean.ZhongTwo_Bean;


public interface TuiJian_P {
    void onSuccess(ZhongBean<ZhongTwo_Bean<TuiJian_Bean>> arr);
    void onFailure(String error);
}
