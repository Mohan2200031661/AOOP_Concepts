package ThreadDemos;

class ThreadJoinDemo extends Thread
{    
	 public void run()
	 {    
		  for(int i=1;i<=5;i++)
		  {    
			  try
			  {    
				  	Thread.sleep(5000);    
			  }
			  catch(Exception e)
			  {
				  	System.out.println(e);
			  }    
			  System.out.println(i);    
		  }    
	 }    
	public static void main(String args[])
	{    
		ThreadJoinDemo t1=new ThreadJoinDemo();    
		ThreadJoinDemo t2=new ThreadJoinDemo();    
		ThreadJoinDemo t3=new ThreadJoinDemo();    
		t1.start();    
		try
		{    
				t1.join();    
		}
		catch(Exception e)
		{
			System.out.println(e);
		}    
	    t2.start();    
	    t3.start();    
	 }    
}    