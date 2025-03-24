package ThreadDemos;

//program to insert elements in the BlockingQueue  
//importing packages that support BlockingQueue  
import java.util.concurrent.LinkedBlockingDeque ;  
import java.util.concurrent.BlockingQueue ;  
import java.util.* ;  
public class BlockingQAddDemo {  
 public static void main( String[ ] args )  
     throws IllegalStateException  
 {  
     // creating object of the BlockingQueue class  
     BlockingQueue< String > alph  
         = new LinkedBlockingDeque< String >( ) ;  
     // adding alphabets to the Blocking Queue using add( ) method  
     alph.add( " A " ) ;  
     alph.add( " B " ) ;  
     alph.add( " C " ) ;  
     alph.add( " D " ) ;  
     alph.add( " E " ) ;      
     BlockingQueue< String > alph2  
         = new LinkedBlockingDeque< String >( ) ;  
     // adding collection of elements using addAll( ) method  
     alph2.addAll( alph ) ;  
     // before removing print BlockingQueue  
     System.out.println( " Contents of Blocking Queue : " + alph ) ;  
     System.out.println( " Contents of another Blocking Queue : " + alph2 ) ;  
 }   
}  