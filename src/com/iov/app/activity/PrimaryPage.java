package com.iov.app.activity;

import com.iov.app.R;
import com.iov.app.model.FragmentInfo;
import com.iov.app.model.FragmentMap;
import com.iov.app.model.FragmentMe;
import com.iov.app.model.FragmentQuery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

/*
 *  登录后进入的界面，主界面
 */
public class PrimaryPage extends ActionBarActivity implements OnClickListener {

	/*
	 * 声明菜单4个组件的类的实例
	 */
	private FragmentInfo fragmentInfo;
	private FragmentMap fragmentMap;
	private FragmentQuery fragmentQuery;
	private FragmentMe fragmentMe;

	/*
	 * 声明菜单4个layout
	 */
	private FrameLayout infoFl, mapFl, queryFl, meFl;

	/*
	 * 声明菜单4个图标的imageView
	 */
	private ImageView infoIv, mapIv, queryIv, meIv;

	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.primary_page); 

		/*
		 * 初始化控件对象
		 */
		initView();

		/*
		 * 设置监听
		 */
		setListener();

		seleteInfo();
	}

	private void initView() {
		// TODO Auto-generated method stub

		infoFl = (FrameLayout) findViewById(R.id.info_framelayout);
		mapFl = (FrameLayout) findViewById(R.id.map_framelayout);
		queryFl = (FrameLayout) findViewById(R.id.query_framelayout);
		meFl = (FrameLayout) findViewById(R.id.me_framelayout);

		/*
	     * 
	     */
		infoIv = (ImageView) findViewById(R.id.info_image);
		mapIv = (ImageView) findViewById(R.id.map_image);
		queryIv = (ImageView) findViewById(R.id.query_image);
		meIv = (ImageView) findViewById(R.id.me_image);
	}

	private void setListener() {
		// TODO Auto-generated method stub

		infoFl.setOnClickListener(this);
		mapFl.setOnClickListener(this);
		queryFl.setOnClickListener(this);
		meFl.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		//
		case R.id.info_framelayout:
			seleteInfo();
			break;
		//
		case R.id.map_framelayout:
			seleteMap();
			break;
		//
		case R.id.query_framelayout:
			seleteQuery();
			break;
		//
		case R.id.me_framelayout:
			seleteMe();
			break;
		//
		}
	}

	private void seleteInfo() {
		// TODO Auto-generated method stub
		fragmentInfo = new FragmentInfo();
		// 
		FragmentTransaction fragmentTransaction = this
				.getSupportFragmentManager().beginTransaction();
		// 
		fragmentTransaction.replace(R.id.frame_content, fragmentInfo);
		// 
		fragmentTransaction.commit();
		//
		
		Button button=(Button) findViewById(R.id.primary_page_detail_bt);
	
		if(button==null){
			Log.d("info", "yes");
		}
		
		infoFl.setSelected(true);
		infoIv.setSelected(true);

		mapFl.setSelected(false);
		mapIv.setSelected(false);

		queryFl.setSelected(false);
		queryIv.setSelected(false);

		meFl.setSelected(false);
		meIv.setSelected(false);
		
	}

	


	private void seleteMap() {
		// TODO Auto-generated method stub
		fragmentMap = new FragmentMap();
		// 
		FragmentTransaction fragmentTransaction = this
				.getSupportFragmentManager().beginTransaction();
		// 
		fragmentTransaction.replace(R.id.frame_content, fragmentMap);
		// 
		fragmentTransaction.commit();

		infoFl.setSelected(false);
		infoIv.setSelected(false);

		queryFl.setSelected(false);
		queryIv.setSelected(false);

		meFl.setSelected(false);
		meIv.setSelected(false);

		mapFl.setSelected(true);
		mapIv.setSelected(true);
	}

	private void seleteQuery() {
		// TODO Auto-generated method stub
		fragmentQuery = new FragmentQuery();
		//
		FragmentTransaction fragmentTransaction = this
				.getSupportFragmentManager().beginTransaction();
		// 
		fragmentTransaction.replace(R.id.frame_content, fragmentQuery);
		// 
		fragmentTransaction.commit();

		infoFl.setSelected(false);
		infoIv.setSelected(false);

		queryFl.setSelected(true);
		queryIv.setSelected(true);

		meFl.setSelected(false);
		meIv.setSelected(false);

		mapFl.setSelected(false);
		mapIv.setSelected(false);
	}

	private void seleteMe() {
		// TODO Auto-generated method stub
		fragmentMe = new FragmentMe();
		// 
		FragmentTransaction fragmentTransaction = this
				.getSupportFragmentManager().beginTransaction();
		// 
		fragmentTransaction.replace(R.id.frame_content, fragmentMe);
		// 
		fragmentTransaction.commit();

		infoFl.setSelected(false);
		infoIv.setSelected(false);

		queryFl.setSelected(false);
		queryIv.setSelected(false);

		meFl.setSelected(true);
		meIv.setSelected(true);

		mapFl.setSelected(false);
		mapIv.setSelected(false);
	}

}
