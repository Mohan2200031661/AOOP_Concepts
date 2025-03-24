package ThreadDemos;

class Table8  
{      
 void printTable(int n){    
   synchronized(this){//synchronized block    
     for(int i=1;i<=5;i++){    
      System.out.println(n*i);    
      try{    
       Thread.sleep(400);    
      }catch(Exception e){System.out.println(e);}    
     }    
   }    
 }//end of the method    
}    
    
class MyThreada extends Thread{    
Table8 t;    
MyThreada(Table8 t){    
this.t=t;    
}    
public void run(){    
t.printTable(5);    
}    
    
}    
class MyThreadb extends Thread{    
Table8 t;    
MyThreadb(Table8 t){    
this.t=t;    
}    
public void run(){    
t.printTable(100);    
}    
}    
    
public class SyncBlockDemo{    
public static void main(String args[]){    
Table8 obj = new Table8();//only one object    
MyThreada t1=new MyThreada(obj);    
MyThreadb t2=new MyThreadb(obj);    
t1.start();    
t2.start();    
}    
}   
