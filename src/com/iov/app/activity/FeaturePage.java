package com.iov.app.activity;

import com.iov.app.R;

import android.os.Bundle;
import android.view.Window;

/*
 *  主页面、功能选择页面Activity
 */
public class FeaturePage extends BaseActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		 setContentView(R.layout.feature_page);
		 
		 
		 
	}
	
}
