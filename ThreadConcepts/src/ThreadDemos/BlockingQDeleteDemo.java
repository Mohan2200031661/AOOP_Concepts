package ThreadDemos;

//program to delete elements from the queue  
//importing the package that support BlockingQueue  
import java.util.concurrent.* ;  
public class BlockingQDeleteDemo {  
 public static void main( String[] args )  
 {  
     // creating an object of the class LinkedBlockingDeque  
     BlockingQueue< String > alph  
         = new LinkedBlockingDeque< String >( ) ;  
     // adding the elements to the BlockingQueue using add( ) method  
     alph.add( " A " ) ;  
     alph.add( " B " ) ;  
     alph.add( " C " ) ;  
     alph.add( " D " ) ;  
     alph.add( " E " ) ;  
     // printing the elements of the blocking queue  
     System.out.println(  
         " The content of LinkedBlockingDeque is : " ) ;  
     System.out.println( alph ) ;  
     // removing the elements from the queue using the remove( ) function   
     alph.remove( " C " ) ;  
     alph.remove( " E " ) ;  
     // let us see what will happen if we try to remove an element that actually does not exist in the queue  
     alph.remove( " Y " ) ;  
     // Print the elements of the alph object of BlockingQueue  
     System.out.println(  
         " The content of the LinkedBlockingDeque after removing elements is : " ) ;  
     System.out.println( alph ) ;  
 }  
}  
