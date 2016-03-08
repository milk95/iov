package com.iov.app.activity;


import com.iov.app.R;

import android.os.Bundle;
import android.view.Window;

public class VehicleInfoEdit extends BaseActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.vehicle_info_edit_page);
	}
}
