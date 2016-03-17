package com.softforall.backgroundhd.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.softforall.backgroundhd.R;
import com.softforall.backgroundhd.R.id;
import com.softforall.backgroundhd.R.layout;
import com.softforall.backgroundhd.UI.SelectableRoundedImageView;
import com.softforall.backgroundhd.model.ObjectImage;

public class ItemLibraryAdapter extends BaseAdapter {

	private List<ObjectImage> objects = new ArrayList<ObjectImage>();

	private Context context;
	private LayoutInflater layoutInflater;

	public ItemLibraryAdapter(Context context, List<ObjectImage> objectImages) {
		this.context = context;
		this.layoutInflater = LayoutInflater.from(context);
		this.objects = objectImages;
	}

	@Override
	public int getCount() {
		return objects.size();
	}

	@Override
	public ObjectImage getItem(int position) {
		return objects.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = layoutInflater.inflate(R.layout.item_library, null);
			ViewHolder viewHolder = new ViewHolder();
			viewHolder.textView1 = (TextView) convertView
					.findViewById(R.id.textView1);
			viewHolder.image0 = (SelectableRoundedImageView) convertView
					.findViewById(R.id.image0);

			convertView.setTag(viewHolder);
		}
		initializeViews((ObjectImage) getItem(position),
				(ViewHolder) convertView.getTag());
		return convertView;
	}

	private void initializeViews(ObjectImage object, ViewHolder holder) {
		holder.textView1.setText(object.getTitle());
	}

	protected class ViewHolder {
		private TextView textView1;
		private SelectableRoundedImageView image0;
	}
}