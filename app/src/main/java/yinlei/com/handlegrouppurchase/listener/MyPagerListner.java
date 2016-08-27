package yinlei.com.handlegrouppurchase.listener;

import android.support.v4.view.ViewPager;

import yinlei.com.handlegrouppurchase.widget.ViewPagerIndicator;


//ViewPager的监听事件
    public class MyPagerListner implements ViewPager.OnPageChangeListener {
    private ViewPagerIndicator mIndicator;

    public MyPagerListner(ViewPagerIndicator indicator) {
        mIndicator = indicator;
    }

    @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            mIndicator.setOffX(position, positionOffset);
        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
