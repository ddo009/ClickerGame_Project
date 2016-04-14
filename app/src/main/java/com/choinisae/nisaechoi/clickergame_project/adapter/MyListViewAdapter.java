package com.choinisae.nisaechoi.clickergame_project.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.choinisae.nisaechoi.clickergame_project.R;
import com.choinisae.nisaechoi.clickergame_project.modelpackage.ShopItem;

import java.util.List;

/**
 * Created by donghaechoi on 2016. 4. 14..
 */
public class MyListViewAdapter extends BaseAdapter {

    private Context mContext;
    private List<ShopItem> mData;
    private LayoutInflater mInflater;

    public MyListViewAdapter(Context mContext, List<ShopItem> mData) {
        this.mContext = mContext;
        this.mData = mData;
        this.mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.shop_listitem, parent, false);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.shop_listitem_image);
            TextView textView = (TextView) convertView.findViewById(R.id.shop_listitem_name);
            Button button = (Button) convertView.findViewById(R.id.shop_buy_btn);

            holder.imageView = imageView;
            holder.textView = textView;
            holder.button = button;
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ShopItem item = (ShopItem) getItem(position);
        holder.imageView.setImageResource(item.getShopItemImageRes());
        holder.textView.setText(item.getShopTextView());
        holder.button.setText(item.getButtonText());

        return convertView;
    }

    private static class ViewHolder {
        ImageView imageView;
        TextView textView;
        Button button;
    }

}
