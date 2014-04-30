/**
 * @author paolo
 * 
 * @version  00.2 - Risoluzione del problema con Handler
 * 
 */

package com.example.appthread00;

import com.example.appthread00.R;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

@SuppressLint("HandlerLeak")
public class MainActivity extends Activity  {


	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Handler mioHandler = new Handler(){
			  @Override
			  public void handleMessage(Message msg) {
				  
				  TextView t = (TextView) findViewById(R.id.testo1);
				  
				  CharSequence old = t.getText();
				  t.setText( old + "\n"+ (String) msg.obj);
			     }
			 };
		
		
			 
		new SimpleThread("primoTask", mioHandler ).start();
		new SimpleThread("secondoTask", mioHandler ).start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
}
