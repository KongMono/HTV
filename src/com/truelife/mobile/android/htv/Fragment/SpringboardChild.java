package com.truelife.mobile.android.htv.Fragment;

import com.truelife.mobile.android.htv.Activity.MainActivity;
import com.truelife.mobile.android.htv.Dataset.SBEntry;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.ListView;


public class SpringboardChild extends SpringboardFragment {
	
	private Context context;
	private String TAG = getClass().getSimpleName();
	
	public SpringboardChild(Context c) {
		super(c);
		this.context = c;
	}

	@Override
	protected int specificMenu(SBEntry springboardITem, ListView l, int position) {

		String template = springboardITem.getTemplate();
		Log.i(TAG, "template " + template);

		String title = springboardITem.getTitle();


		if (template.equals("home")) {
			switchFragment(new MainActivity(title));
		} 
		return position;
	}

}
