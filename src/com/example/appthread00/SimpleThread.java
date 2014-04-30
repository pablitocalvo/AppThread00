package com.example.appthread00;

/**
 * @author paolo
 * 
 * @version  00.0 - semplice "porting" di DueThread.java
 * 					i thread comunicano con System.Out.Println
 * 
 */


public class SimpleThread extends Thread {
	
	
	public SimpleThread(String threadName ) {
		super(threadName);
		
	}


		

    public void run() 
    {
    	for (int i = 0; i < 10; i++) 
    	{
			System.out.println(this.getName()+" "+ i ); 
		    try 
		    {
		    	sleep((int)(Math.random() * 1000));
		    } 
		    catch (InterruptedException e) {}
	}
	System.out.println( getName()+ " ha FINITO");
    }
    
}
