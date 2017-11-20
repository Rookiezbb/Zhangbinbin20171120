package com.bawei.zhangbinbin20171120.utils;

import android.content.Intent;

import com.bawei.zhangbinbin20171120.bean.MyBean;

import java.util.Map;

import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by Zhang on 2017/11/20.
 */

public interface ApiService {

    @POST
    Observable<MyBean> getDatas(@Url String url, @QueryMap Map<String,String> map);
}
