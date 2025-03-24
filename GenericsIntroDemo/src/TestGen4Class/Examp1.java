package TestGen4Class;

//Java program to show working of user defined
//Generic classes

//We use < > to specify Parameter type
class Test<T>
{
    // An object of type T is declared
    T obj;
    Test(T obj) 
    { 
    	this.obj = obj; 
    } // constructor
    
    public T getObject() 
    {
    	return this.obj;
    }
}

public class Examp1 
{

	public static void main(String[] args) 
	{
		  // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(35);
        System.out.println(iObj.getObject());
  
        // instance of String type
        Test<String> sObj = new Test<String>("Hello to Java Generics - Generic Classes");
        System.out.println(sObj.getObject());

	}

}
