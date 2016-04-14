package com.choinisae.nisaechoi.clickergame_project.activitys;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.choinisae.nisaechoi.clickergame_project.R;
import com.choinisae.nisaechoi.clickergame_project.adapter.MyFragmentPagerAdapter;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, TabLayout.OnTabSelectedListener {

    private ImageView mImageView;
    public static BigInteger mMoney = new BigInteger("0");
    public static BigInteger mGetMoney = new BigInteger("1");
    private TextView mMoneyText;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private MyFragmentPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.main_image_view);
        mImageView.setOnClickListener(this);
        mMoneyText = (TextView) findViewById(R.id.my_money_textView);

        mTabLayout = (TabLayout) findViewById(R.id.main_tablayout);
        mTabLayout.addTab(mTabLayout.newTab().setText("능력치"));
        mTabLayout.addTab(mTabLayout.newTab().setText("고용"));
        mTabLayout.addTab(mTabLayout.newTab().setText("상점"));
        mTabLayout.setOnTabSelectedListener(this);

        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.main_viewpager);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mViewPager.setAdapter(mAdapter);
    }


    // 이미지뷰 터치시 돈을 획득합니다.
    @Override
    public void onClick(View v) {
        mMoney = mMoney.add(mGetMoney);
        mMoneyText.setText("소지금 : " + mMoney.toString());
    }


    /**
     * tabLayout을 ViewPager에 연
     *
     * @param tab
     */
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
