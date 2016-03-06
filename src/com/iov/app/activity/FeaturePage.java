package com.iov.app.activity;

import com.iov.app.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

/*
 *  主页面、功能选择页面Activity
 */
public class FeaturePage extends BaseActivity implements OnClickListener{

	/*
	 *  声明控件对象
	 */
	private Button addInfoBt;
	private Button reserveBt;
	private Button locateBt;
	private Button serviceBt;
	private Button queryBt;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		 setContentView(R.layout.feature_page);	 
		 
		 /*
		  *  初始化控件对象
		  */
		 addInfoBt=(Button) findViewById(R.id.add_info_bt);
		 reserveBt=(Button) findViewById(R.id.reserve_bt);
		 locateBt=(Button) findViewById(R.id.locate_bt);
		 serviceBt=(Button) findViewById(R.id.service_bt);
		 queryBt=(Button) findViewById(R.id.query_bt);
		 
		 /*
		  *  监听按钮控件
		  */
		 addInfoBt.setOnClickListener(this);
		 reserveBt.setOnClickListener(this);
		 locateBt.setOnClickListener(this);
		 serviceBt.setOnClickListener(this);
		 queryBt.setOnClickListener(this);
	}
	
	/*
	 *  点击按钮事件
	 */
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
				switch(v.getId()){	
				case R.id.add_info_bt:{
					Intent addInfoIntent=new Intent();
					addInfoIntent.setClass(this, InfoBunding.class);
					startActivity(addInfoIntent);
					break;
				}
				
				case R.id.reserve_bt:{
					
				}
				
				case R.id.locate_bt:{
					
				}
				
				case R.id.service_bt:{
					Intent serviceIntent=new Intent();
					serviceIntent.setClass(this, InfoBunding.class);
					startActivity(serviceIntent);
					break;
				}
				
				case R.id.query_bt:{
					
				}
				
				default:
					break;
				}
	}
}










