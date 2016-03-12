package com.iov.app.activity;

import java.util.ArrayList;
import java.util.List;
import com.iov.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class AddNewVehicle extends Activity implements OnItemSelectedListener{

	/*
	 * 声明控件对象
	 */
	private Spinner brandSpinner;
	private Button backBt;
	private Button addBt;
	
	private List<String>  dataList;
	private ArrayAdapter<String> adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.add_new_vehicle_page);
		
		/*
         *  初始化控件对象
         */
        brandSpinner=(Spinner) findViewById(R.id.vehicle_brand_spinner);
        backBt=(Button) findViewById(R.id.add_vehicle_back_bt);
        addBt=(Button) findViewById(R.id.add_vehicle_save);
        
        
        /*
         *  设置数据源
         */
        dataList=new ArrayList<String>();
        dataList.add("123456");
        dataList.add("654321");
        /*
         *  创建数组适配器
         */
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dataList);
        /*
         * 设置adapter下拉列表样式
         */
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        /*
         *  加载适配器
         */
        brandSpinner.setAdapter(adapter);
        /*
         *  设置监听器
         */
        backBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        
        addBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            		Intent intent=new Intent();
            		intent.setClass(v.getContext(), VehicleInfoEdit.class);
            		startActivity(intent);
            }
        });
        brandSpinner.setOnItemSelectedListener(this);
	}
	
	public void onItemSelected(AdapterView<?> parent, View v, int position,
			long id) {
		// TODO Auto-generated method stub
		String num=adapter.getItem(position);
		Toast.makeText(this, num, Toast.LENGTH_LONG).show();
	}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
}
