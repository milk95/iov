package com.iov.app.manager;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;

/*
 * 活动管理器类
 */
public class ActivityCollector {
	/*
	 *  声明管理活动的list
	 */
	public static List<Activity> activities=new ArrayList<Activity>();

	/*
	 *  分别为添加、移除、关闭所有活动
	 */
	public static void addActivity(Activity activity){
		activities.add(activity);
	}
	
	public static void removeActivity(Activity activity){
		activities.remove(activity);
	}
	
	public static void finishAll(){
		for(Activity activity:activities){
			if(!activity.isFinishing()){
				activity.finish();
			}
		}
	}	
}





