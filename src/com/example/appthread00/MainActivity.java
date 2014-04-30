/**
 * @author paolo
 * 
 * @version  00.2A - Soluzione con AsyncTask 
 *                  
 */

package com.example.appthread00;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView t ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		t = (TextView) this.findViewById(R.id.testo1);
		//t1 = (TextView) this.findViewById(R.id.testo2);
		new SempliceAsyncTask(t).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,"primo Task ");
		new SempliceAsyncTask(t).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,"secondo Task ");
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}
