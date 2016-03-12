package com.iov.app.activity;

import com.iov.app.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class VehicleInfo extends BaseActivity implements OnClickListener{

	/*
	 *  声明控件对象
	 */
	private Button addBt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.vehicle_info_list_page);
		
		/*
		 *  初始化控件对象
		 */
		addBt=(Button) findViewById(R.id.vehicle_info_add_bt);
		
		/*
		 *  设置监听器
		 */
		addBt.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		
		case R.id.vehicle_info_add_bt:
			Intent intent=new Intent();
			intent.setClass(this, AddNewVehicle.class);
			startActivity(intent);
		}
	}
}
