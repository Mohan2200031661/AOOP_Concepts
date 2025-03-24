package TestGen5Method;

//Java program to show working of user defined
//Generic functions
public class GenMethodDemo {
	// A Generic method example
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()+ " = " + element);
    }
  
    // Driver method
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(35);
  
        // Calling generic method with String argument
        genericDisplay("Generic Method Demonstration");
  
        // Calling generic method with double argument
        genericDisplay(12.5);
        
        genericDisplay();
    }
}
