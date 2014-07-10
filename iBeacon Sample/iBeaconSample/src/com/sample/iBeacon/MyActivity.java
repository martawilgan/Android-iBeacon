package com.sample.iBeacon;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;

public class MyActivity extends FragmentActivity{
	
	@Override
	protected void onResume(){
		super.onResume();
		startService(new Intent(BeaconService.class.getName()));
	}
}