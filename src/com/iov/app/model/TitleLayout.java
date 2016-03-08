package com.iov.app.model;

import com.iov.app.R;
import com.iov.app.activity.FeaturePage;
import com.iov.app.activity.VehicleInfoEdit;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class TitleLayout extends RelativeLayout{

	public TitleLayout(Context context, AttributeSet attrs) {
		
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.check_info_page_title, this);
        
		Button titleBackBt = (Button) findViewById(R.id.title_back_bt);
        Button titleAddBt = (Button) findViewById(R.id.title_add_bt);
        
        titleBackBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });
        
        titleAddBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            		Intent intent=new Intent();
            		intent.setClass((Activity) getContext(), VehicleInfoEdit.class);
            		
            }
        });
       
	}

	
}










