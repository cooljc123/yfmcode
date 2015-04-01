package com.pro.adapter;

import java.util.List;
import java.util.Map;

import com.pro.ltax.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
/**
 * 法律法规显示 适配器类
 * @author lenovo
 *
 */
public class FlFgAdapter extends BaseAdapter {

	private Context context;
	private List<Map<String, String>> lmo;
	public FlFgAdapter(Context context,List<Map<String, String>> lmo){
		this.context=context;
		this.lmo=lmo;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return lmo.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return lmo.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View view, ViewGroup arg2) {
		// TODO Auto-generated method stub
		Map<String, String> mo=lmo.get(arg0);
		if(view==null){
			view=LayoutInflater.from(context).inflate(R.layout.activity_flfg_item, null);
		}
		TextView fenlei=(TextView)view.findViewById(R.id.fenlei);
		fenlei.setText(mo.get("fenlei"));
		return view;
	}

}
