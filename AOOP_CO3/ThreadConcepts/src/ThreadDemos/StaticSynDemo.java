package ThreadDemos;

class Table1  
{   
	synchronized static void printTable(int n){    
		   for(int i=1;i<=10;i++){    
		     System.out.println(n*i);    
		     try{    
		       Thread.sleep(400);    
		     }catch(Exception e){}    
		   }    
 
 }    
}   
class MyThreadq extends Thread{    
public void run(){    
	Table1.printTable(1);    
}    
}    
class MyThreadr extends Thread{    
public void run(){    
	Table1.printTable(10);
}    
}    
class MyThreads extends Thread{    
public void run(){    
	Table1.printTable(100);
}    
}    
class MyThreadt extends Thread{    
public void run(){    
	Table1.printTable(1000);
}    
}    
public class StaticSynDemo{    
public static void main(String t[]){    
MyThreadq t1=new MyThreadq();    
MyThreadr t2=new MyThreadr();    
MyThreads t3=new MyThreads();    
MyThreadt t4=new MyThreadt();    
t1.start();    
t2.start();    
t3.start();    
t4.start();    
}    
}    