package com.iov.app.activity;

import com.iov.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/*
 *  登录界面Activity
 */
public class Hello extends BaseActivity implements OnClickListener{

	/*
	 *  声明控件对象
	 */
	private Button loginBt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.welcome_page);
		
		/*
		 *  初始化控件对象
		 */
		loginBt=(Button) findViewById(R.id.login_bt);
		/*
		 *  监听按钮对象
		 */
		loginBt.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		Intent intent=new Intent();
		intent.setClass(this, FeaturePage.class);
		startActivity(intent);
	}
}
