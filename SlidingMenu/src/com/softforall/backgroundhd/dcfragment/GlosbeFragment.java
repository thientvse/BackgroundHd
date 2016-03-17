package com.softforall.backgroundhd.dcfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.softforall.backgroundhd.R;

public class GlosbeFragment extends Fragment {
	
	
	public static GlosbeFragment newInstance() {
		GlosbeFragment f = new GlosbeFragment();
		return f;
	}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_globse, container, false);
         
        return rootView;
    }
}
