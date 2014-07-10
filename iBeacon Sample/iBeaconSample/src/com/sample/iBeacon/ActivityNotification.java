package com.sample.iBeacon;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

public class ActivityNotification extends Activity {

	@Override 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification);
		TextView tvMsg = (TextView) findViewById(R.id.tvMsg);
		Intent intent = getIntent();
		String out = intent.getStringExtra("m");
		if (out != null){
			tvMsg.setText(out);
		}
	}
}
