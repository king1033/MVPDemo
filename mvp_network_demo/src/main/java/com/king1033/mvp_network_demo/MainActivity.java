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

    private List<GiftBean.ListBean>beanList = new ArrayList<>();
    private ListAdapter mListAdapter;
    private IPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mPresenter = new PresenterImpl(this);
        setupListView();
        mPresenter.getGiftList(1);
    }

    private void setupListView() {
        mListAdapter = new ListAdapter(beanList, this);
        mListView.setAdapter(mListAdapter);
    }

    @Override
    public void refreshListView(List<GiftBean.ListBean> listBeen) {
        beanList.addAll(listBeen);
        mListAdapter.notifyDataSetChanged();
    }
}
