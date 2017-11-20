package com.bawei.zhangbinbin20171120;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.bawei.zhangbinbin20171120.bean.MyBean;
import com.bawei.zhangbinbin20171120.presenter.PlayPresenter;
import com.bawei.zhangbinbin20171120.utils.Api;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements PlayContrast.IView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //http://api.svipmovie.com/front/columns/getVideoList.do?catalogId=402834815584e463015584e539330016&pnum=33
        PlayPresenter playPresenter = new PlayPresenter(this);
        playPresenter.LoadData(Api.HOST,Api.catalogId,50);
    }

    @Override
    public void ShowData(List<MyBean.RetBean.ListBean> list) {
        //Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void ShowError(String e) {
        Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        Log.e("及哈哈哈哈哈哈哈哈哈哈哈",e);
    }

   /* private int getNextPage() {
        if (SystemUtils.isNetworkConnected()) {
            page = StringUtils.getRandomNumber(1, 108);
        }
        return page;
    }
    public static int getRandomNumber(int min, int max) {
        return new Random().nextInt(max) % (max - min + 1) + min;
    }*/
}
