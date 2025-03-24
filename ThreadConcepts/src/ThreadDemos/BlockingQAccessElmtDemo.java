package ThreadDemos;

//accessing elements from the Blocking Queue  
//importing the Dart package that support BlockingQueue  
import java.util.concurrent.* ;  

public class BlockingQAccessElmtDemo {  
  public static void main( String[ ] args )  
 {  
      // creating an object of the class LinkedBlockingDeque  
     BlockingQueue< String > alph  
         = new LinkedBlockingDeque< String >( ) ;  

     // adding elements to the BlockingQueue using add( ) method  
     alph.add( " A " ) ;  
     alph.add( " B " ) ;  
     alph.add( " C " ) ;  
     alph.add( " D " ) ;  
     alph.add( " E " ) ;  
     // printing the elements of the BlockingQueue  
     System.out.println(  
         " The contents of the Linked Blocking Queue is : " ) ;  
     System.out.println( alph ) ;  
     // retrieving the element alphabet ' C ' from the queue  
     if ( alph.contains( " C " ) )  
         System.out.println(  
             " Yayy! Element C successfully founded in the queue " ) ;  
     else  
         System.out.println( " No such element exists in the queue. " ) ;  

     // Accessing the first element of the queue using the function element( )   
     String top = alph.element( ) ;  
     System.out.println( " The top element of the queue is : " + top ) ;  
 }  
}  
