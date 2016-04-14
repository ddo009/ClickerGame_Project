package com.choinisae.nisaechoi.clickergame_project.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.choinisae.nisaechoi.clickergame_project.R;
import com.choinisae.nisaechoi.clickergame_project.adapter.MyListViewAdapter;
import com.choinisae.nisaechoi.clickergame_project.modelpackage.ShopItem;

import java.util.ArrayList;

// 상점 아이템 Fragment
public class ShopFragment extends Fragment {

    private ShopItem mData;
    private ArrayList<ShopItem> mList;
    private MyListViewAdapter mMyAdapter;

    public ShopFragment() {
        // Required empty public constructor
    }

    public static ShopFragment newInstance() {
        ShopFragment fragment = new ShopFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 임시 데이터
        mData = new ShopItem();
        mData.setShopItemImageRes(android.R.mipmap.sym_def_app_icon);
        mData.setShopTextView("아이템설명");
        mData.setButtonText("구매");
        mList = new ArrayList<>();
        mList.add(mData);
        mList.add(mData);
        mList.add(mData);
        mList.add(mData);
        mMyAdapter = new MyListViewAdapter(getContext(), mList);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_shop, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        ListView listView = (ListView) view.findViewById(R.id.shop_listView);
        listView.setAdapter(mMyAdapter);
        super.onViewCreated(view, savedInstanceState);

    }
}
