package ThreadDemos;

//example of java synchronized method  
class Table9{  
synchronized void printTable(int n){//synchronized method  
 for(int i=1;i<=5;i++){  
   System.out.println(n*i);  
   try{  
    Thread.sleep(400);  
   }catch(Exception e){System.out.println(e);}  
 }  

}  
}  

class MyThreadx extends Thread{  
Table9 t;  
MyThreadx(Table9 t){  
this.t=t;  
}  
public void run(){  
t.printTable(10);  
}  

}  
class MyThready extends Thread{  
Table9 t;  
MyThready(Table9 t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  

public class SyncMethodDemo{  
public static void main(String args[]){  
Table9 obj = new Table9();//only one object  
MyThreadx t1=new MyThreadx(obj);  
MyThready t2=new MyThready(obj);  
t1.start();  
t2.start();  
}  
}  