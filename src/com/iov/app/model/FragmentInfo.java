package com.iov.app.model;


import com.iov.app.R;
import com.iov.app.activity.VehicleInfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentInfo extends Fragment implements OnClickListener {

	/*
	 *  声明控件对象
	 */
	private Button infoChangeBt;
	private Button detailInfoBt;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		
		
		View view = inflater.inflate(R.layout.fragment_info, container, false);       
		
		infoChangeBt = (Button) view.findViewById(R.id.primary_page_chose_bt);  
		detailInfoBt= (Button) view.findViewById(R.id.primary_page_detail_bt);
		infoChangeBt.setOnClickListener(this);
		detailInfoBt.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		
		case R.id.primary_page_chose_bt:		
			Intent intent=new Intent();
			intent.setClass(getActivity(), VehicleInfo.class);
			startActivity(intent);
			break;
			
		case R.id.primary_page_detail_bt:
			Toast.makeText(getActivity(), "我被点了", Toast.LENGTH_LONG).show();
			break;
		}
	}
}
