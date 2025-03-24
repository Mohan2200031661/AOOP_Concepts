package ThreadDemos;
class ThreadSleepDemo extends Thread{    
 public void run()
 {    
  for(int i=1;i<5;i++)
  {   
  // the thread will sleep for the 500 milli seconds   
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    
	  System.out.println(i);    
  }    
 }    
 public static void main(String args[]){    
	 ThreadSleepDemo t1=new ThreadSleepDemo();    
	 ThreadSleepDemo t2=new ThreadSleepDemo();    
     
  t1.start(); 
  try {
	t1.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  t2.start();    
 }    
}    