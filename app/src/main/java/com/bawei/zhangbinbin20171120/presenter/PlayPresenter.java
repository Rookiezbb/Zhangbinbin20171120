package com.bawei.zhangbinbin20171120.presenter;

import com.bawei.zhangbinbin20171120.PlayContrast;
import com.bawei.zhangbinbin20171120.bean.MyBean;
import com.bawei.zhangbinbin20171120.model.PlayModel;

import java.util.List;

/**
 * Created by Zhang on 2017/11/20.
 */

public class PlayPresenter implements PlayContrast.IPresenter {
    PlayContrast.IView iView;
    PlayContrast.IModel iModel;

    public PlayPresenter(PlayContrast.IView iView) {
        this.iView = iView;
        iModel = new PlayModel();
    }

    @Override
    public void LoadData(String url, String catalogId, int pnum) {
        iModel.RequestData(url, catalogId, pnum, new PlayContrast.OnPlayListener() {
            @Override
            public void OnSuccess(List<MyBean.RetBean.ListBean> list) {
                iView.ShowData(list);
            }

            @Override
            public void OnError(String e) {
                iView.ShowError(e);
            }
        });
    }
}
