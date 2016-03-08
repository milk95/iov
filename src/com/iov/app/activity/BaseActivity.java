package com.iov.app.activity;

import com.iov.app.manager.ActivityCollector;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/*
 *  底层类，继承于Activity，是所有类的父类
 */
public class BaseActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.d("BaseActivity", getClass().getSimpleName());           //打印log日志，当前执行的类
		ActivityCollector.addActivity(this);                              //将当前活动加入活动管理List中
	}
	//
}
