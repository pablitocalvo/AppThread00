/**
 * @author paolo
 * 
 * @version  00.0 - semplice "porting" di DueThread.java
 * 					i thread comunicano con System.Out.Println
 * 
 */

package com.example.appthread00;

import com.example.appthread00.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity  {

		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		new SimpleThread("primoTask").start();
		new SimpleThread("secondoTask").start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
}
