/**
 * @author paolo
 * 
 * @version  00.1 - Tentativo di fornire ai Thread il campo di testo dove poter 
 *                  scrivere
 * 
 */

package com.example.appthread00;

import com.example.appthread00.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity  {

	 
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView t = (TextView) findViewById(R.id.testo1);
		t.setText("ciao Modno");
		
		new SimpleThread("primoTask", t ).start();
		new SimpleThread("secondoTask", t ).start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
}
