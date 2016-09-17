package com.king1033.mvp_network_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.king1033.mvp_network_demo.adapter.ListAdapter;
import com.king1033.mvp_network_demo.bean.GiftBean;
import com.king1033.mvp_network_demo.presenter.IPresenter;
import com.king1033.mvp_network_demo.presenter.impl.PresenterImpl;
import com.king1033.mvp_network_demo.view.IView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements IView {

    @BindView(R.id.gift_list)
    ListView mListView;

    private List<GiftBean.ListBean> beanList = new ArrayList<>();
    private ListAdapter mGiftListAdapter;
    private IPresenter mGiftPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mGiftPresenter = new PresenterImpl(this);
        setupListView();
        mGiftPresenter.getGiftList(1);
    }

    private void setupListView() {
        mGiftListAdapter = new ListAdapter(beanList,this);
        mListView.setAdapter(mGiftListAdapter);
    }

    @Override
    public void refreshListView(List<GiftBean.ListBean> listBeens) {
        beanList.addAll(listBeens);
        mGiftListAdapter.notifyDataSetChanged();
    }
}
