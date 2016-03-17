package com.softforall.backgroundhd;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.softforall.backgroundhd.R;
import com.softforall.backgroundhd.UI.PagerSlidingTabStrip;
import com.softforall.backgroundhd.dcfragment.GlobseOfDayFragment;
import com.softforall.backgroundhd.dcfragment.GlosbeFragment;
import com.softforall.backgroundhd.dcfragment.LibraryFragment;
import com.softforall.backgroundhd.dcfragment.RecentFragment;

public class DiscoveryFragment extends Fragment implements OnPageChangeListener {

	public static DiscoveryFragment newInstance() {
		DiscoveryFragment f = new DiscoveryFragment();
		return f;
	}

	private PagerSlidingTabStrip tabs;
	private ViewPager pager;
	private MyPagerAdapter adapter;

	private LinearLayout mTabsLinearLayout;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_discovery,
				container, false);

		tabs = (PagerSlidingTabStrip) rootView.findViewById(R.id.tabs);
		pager = (ViewPager) rootView.findViewById(R.id.pager);
		adapter = new MyPagerAdapter(getFragmentManager());

		pager.setAdapter(adapter);
		setUpTabStrip();
		final int pageMargin = (int) TypedValue.applyDimension(
				TypedValue.COMPLEX_UNIT_DIP, 4, getResources()
						.getDisplayMetrics());
		pager.setPageMargin(pageMargin);
		tabs.setViewPager(pager);

		tabs.setOnPageChangeListener(this);
		// set gia tri mac dinh
		pager.setCurrentItem(3);
		return rootView;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	public class MyPagerAdapter extends FragmentStatePagerAdapter {

		private final String[] TITLES = { getString(R.string.str_library),
				getString(R.string.str_globse), getString(R.string.str_recent),
				getString(R.string.str_globse_day) };

		public MyPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public CharSequence getPageTitle(int position) {
			return TITLES[position];
		}

		@Override
		public int getCount() {
			return TITLES.length;
		}

		@Override
		public Fragment getItem(int position) {
			switch (position) {
			case 0:
				return LibraryFragment.newInstance();
			case 1:
				return GlosbeFragment.newInstance();
			case 2:
				return RecentFragment.newInstance();
			case 3:
				return GlobseOfDayFragment.newInstance();
			default:
				return LibraryFragment.newInstance();
			}
		}

	}

	public void setUpTabStrip() {

		// your other customizations related to tab strip...blahblah
		// Set first tab selected
		mTabsLinearLayout = ((LinearLayout) tabs.getChildAt(0));
		for (int i = 0; i < mTabsLinearLayout.getChildCount(); i++) {
			TextView tv = (TextView) mTabsLinearLayout.getChildAt(i);
			if (i == 0) {
				tv.setTextColor(Color.WHITE);
			} else {
				tv.setTextColor(Color.GRAY);
			}
		}
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {

	}

	@Override
	public void onPageSelected(int position) {
		for (int i = 0; i < mTabsLinearLayout.getChildCount(); i++) {
			TextView tv = (TextView) mTabsLinearLayout.getChildAt(i);
			if (i == position) {
				tv.setTextColor(Color.WHITE);
			} else {
				tv.setTextColor(Color.GRAY);
			}
		}
	}

}
