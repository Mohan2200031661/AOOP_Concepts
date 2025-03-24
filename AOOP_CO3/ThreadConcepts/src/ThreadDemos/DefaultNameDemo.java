package ThreadDemos;

class DefaultNameDemo extends Thread{  
	 public void run(){  
	  System.out.println(Thread.currentThread().getName());  
	 }  
	 public static void main(String args[]){  
		 DefaultNameDemo t1=new DefaultNameDemo();  
		 DefaultNameDemo t2=new DefaultNameDemo();  
	  //t1.setName("Pavi");
	  t1.start();  
	  t2.start();  
	 }  
	}  
