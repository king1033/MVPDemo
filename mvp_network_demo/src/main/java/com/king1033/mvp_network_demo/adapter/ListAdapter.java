package com.king1033.mvp_network_demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.king1033.mvp_network_demo.R;
import com.king1033.mvp_network_demo.bean.GiftBean;
import com.king1033.mvp_network_demo.http.HttpUtils;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Author:king1033
 * @Desc:
 * @Time:2016/9/18
 */
public class ListAdapter extends BaseAdapter {
    private Context mContext;
    private List<GiftBean.ListBean> beanList;

    public ListAdapter(List<GiftBean.ListBean> beanList, Context mContext) {
        this.beanList = beanList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return beanList == null ? 0 : beanList.size();
    }

    @Override
    public Object getItem(int position) {
        return beanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder = null;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_gift_view, parent, false);
            viewHolder = new ViewHolder(view);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        GiftBean.ListBean listBean = beanList.get(position);
        viewHolder.mTitleTxt.setText(listBean.getGname());
        //使用Picasso框架加载图片
        Picasso.with(mContext).load(HttpUtils.BASE_URL + listBean.getIconurl()).into(viewHolder.mImageView);
        return view;
    }

    class ViewHolder {
        @BindView(R.id.gift_item_iv)
        ImageView mImageView;
        @BindView(R.id.gift_item_title_txt)
        TextView mTitleTxt;

        public ViewHolder(View view) {
            view.setTag(this);
            ButterKnife.bind(this, view);
        }
    }
}
