package ClonableDemo;
/*Example 2: Below code explains the proper usage of the Cloneable interface to make the Object.clone() method legal. Classes that implement this interface should override the Object.clone() method (which is protected) so that it can be invoked.*/
//Java program to illustrate Cloneable interface
import java.lang.Cloneable;

//By implementing Cloneable interface
//we make sure that instances of class A
//can be cloned.
class A implements Cloneable {
	int i;
	String s;

	// A class constructor
	public A(int i, String s)
	{
		this.i = i;
		this.s = s;
	}

	// Overriding clone() method
	// by simply calling Object class
	// clone() method.
	@Override
	protected Object clone()
		throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class Test {
	public static void main(String[] args)
		throws CloneNotSupportedException
	{
		A a = new A(20, "Demo on Clonable");

		// cloning 'a' and holding
		// new cloned object reference in b

		// down-casting as clone() return type is Object
		A b = (A)a.clone();

		System.out.println(b.i);
		System.out.println(b.s);
	}
}
