package com.example.appthread00;

import android.os.AsyncTask;
import android.widget.TextView;

 class SempliceAsyncTask extends AsyncTask<String, String, String> 
	{
		TextView t;
		
		
		SempliceAsyncTask (TextView  t )
		{ 	super();
			this.t = t;
		};
		
		@Override
		protected String doInBackground(String... params) 
		{
	        for ( int i=1; i<= 10 ;i++)
	        { //System.out.println(i);
	        
	        	publishProgress(params[0]+" "+i);
	        	try {
					Thread.sleep((int)(Math.random() * 1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
					}	
	        }
	        return (params[0]+" HA FINITO!");
	    }


		@Override
		  protected void onProgressUpdate(String... text) {
			CharSequence old = t.getText();
		    t.setText(old+"\n"+text[0]);
		    }
		
		
		@Override
		  protected void onPostExecute(String result) {
			CharSequence old = t.getText();
		    t.setText(old+"\n"+result);
		     
			  }
		
	}