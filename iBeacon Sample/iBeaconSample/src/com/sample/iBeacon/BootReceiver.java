package com.sample.iBeacon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver{
	
	@Override
	public void onReceive(Context context, Intent intent) {
		
		// Start detecting beacons on boot
        Intent serviceIntent = new Intent(BeaconService.class.getName());
        context.startService(serviceIntent); 
	}
}