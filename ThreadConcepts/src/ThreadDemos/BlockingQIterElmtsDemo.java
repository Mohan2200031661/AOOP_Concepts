package ThreadDemos;

//program to iterate over the elements of the BlockingQueue  
//importing the packages that support BlockingQueue  
import java.util.Iterator ;  
import java.util.concurrent.* ;  
public class BlockingQIterElmtsDemo {  
 public static void main( String[ ] args ) {     
     // creating an object of the LinkedBlockingDeque   
     BlockingQueue< String > alph = new LinkedBlockingDeque< String >( ) ;  
     // adding the elements to the BlockingQueue  
     alph.add( " A " ) ;  
     alph.add( " B " ) ;  
     alph.add( " C " ) ;  
     alph.add( " D " ) ;  
     alph.add( " E " ) ;  
     // Create an iterator to traverse through the BlockingQueue  
     Iterator< String > alphIter = alph.iterator( ) ;  
     // Print the elements of lbdq on to the console  
     System.out.println( " The content of the Linked Blocking Deque is : " ) ;           
     for( int i = 0 ; i < alph.size( ) ; i++ )  
     {  
         System.out.print( alphIter.next( ) + " ") ;  
     }         
 }  
}  