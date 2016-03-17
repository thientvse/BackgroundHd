package com.softforall.backgroundhd.dcfragment;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.softforall.backgroundhd.R;
import com.softforall.backgroundhd.adapter.ItemLibraryAdapter;
import com.softforall.backgroundhd.model.ObjectImage;

public class LibraryFragment extends Fragment {
	
	private Context mContext;
	private List<ObjectImage> objectImages = new ArrayList<ObjectImage>();
	private ItemLibraryAdapter adapter;
	private ListView lstLibrary;
	
	
	public static LibraryFragment newInstance() {
		LibraryFragment f = new LibraryFragment();
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_library, container,
				false);
		
		mContext = getActivity();
		
		test();
		
		lstLibrary = (ListView) rootView.findViewById(R.id.lst_library);
		adapter = new ItemLibraryAdapter(mContext, objectImages);
		lstLibrary.setAdapter(adapter);
		
		return rootView;
	}
	
	// data tesst
	private void test(){
		objectImages.add(new ObjectImage("", "Thể thao", "100"));
		objectImages.add(new ObjectImage("", "Thể thao", "100"));
		objectImages.add(new ObjectImage("", "Thể thao", "100"));
		objectImages.add(new ObjectImage("", "Thể thao", "100"));
		objectImages.add(new ObjectImage("", "Thể thao", "100"));
		objectImages.add(new ObjectImage("", "Thể thao", "100"));
		objectImages.add(new ObjectImage("", "Thể thao", "100"));
		objectImages.add(new ObjectImage("", "Thể thao", "100"));
	}
	
	
	
	
}
