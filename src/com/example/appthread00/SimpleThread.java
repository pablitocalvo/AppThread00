/**
 * @author paolo
 * 
 * @version  00.1 - Tentativo di fornire ai Thread il campo di testo dove poter 
 *                  scrivere
 *                  
 */

package com.example.appthread00;

import android.widget.TextView;


public class SimpleThread extends Thread {
	
	TextView t;
	public SimpleThread(String threadName,TextView t ) {
		super(threadName);
		this.t = t;
	}


    public void run() 
    {	
    	for (int i = 0; i < 10; i++) 
    	{
			// System.out.println(this.getName()+" "+ i ); 
		    
    		CharSequence old = t.getText();
		    t.setText( old + "\n"+ this.getName()+" "+ i);
		    
    		try 
		    {
		    	sleep((int)(Math.random() * 1000));
		    } 
		    catch (InterruptedException e) {}
    	}
    	// System.out.println( getName()+ " ha FINITO");
    	CharSequence old = t.getText();
    	t.setText( old + "\n"+ this.getName()+" ha FINITO");
    }
    
}
