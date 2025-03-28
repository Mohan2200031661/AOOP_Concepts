package TestGen3;
//A class that can refer to any type is known as a generic class. 
//Here, we are using the T type parameter to create the generic class of specific type.
//Let's see a simple example to create and use the generic class.

public class MyGen <T> 
{
	T obj;  
	void add(T obj)
	{
		this.obj=obj;
	}  
	T get()
	{
		return obj;
	}  

}

//The T type indicates that it can refer to any type (like String, Integer, and Employee). 
//The type you specify for the class will be used to store and retrieve the data.
