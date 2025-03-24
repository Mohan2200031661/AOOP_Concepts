package ThreadDemos;
//withSetName method
class NamingDemo1 extends Thread{  
	  public void run(){  
	   System.out.println("running...");  
	  }  
	 public static void main(String args[]){  
		 NamingDemo1 t1=new NamingDemo1();  
		 NamingDemo1 t2=new NamingDemo1();  
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	   
	  t1.start();  
	  t2.start();  
	  
	  t1.setName("Sweety");  
	  System.out.println("After changing name of t1:"+t1.getName());  
	 }  
	}  
