package com.bawei.zhangbinbin20171120;

import com.bawei.zhangbinbin20171120.bean.MyBean;

import java.util.List;

import okhttp3.Interceptor;

/**
 * Created by Zhang on 2017/11/20.
 */

public interface PlayContrast {
    interface IView{
        void ShowData(List<MyBean.RetBean.ListBean> list);
        void ShowError(String e);
    }
    interface IModel{
        void RequestData(String url,String catalogId,int pnum,OnPlayListener onPlayListener);
    }
    interface OnPlayListener{
        void OnSuccess(List<MyBean.RetBean.ListBean> list);
        void OnError(String e);
    }
    interface IPresenter{
        void LoadData(String url,String catalogId,int pnum);
    }
}
