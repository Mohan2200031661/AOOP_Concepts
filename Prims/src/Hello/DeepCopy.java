package Hello;
/*Deep Object Cloning is like creating an exact copy of the original object by copying the fields from the original object to the cloned object. 
 * A separate memory is allocated for the cloned objects where the original object content is copied. 
 * clone() method can create both shallow and deep copy of the original object based on the implementation of it. 
 * Deep copy creates a new memory with the contents same as the original object.
 * That�s why when we change the content of the original object after cloning, the changes do not reflect in the clone object. */

/*Types:
 * 1. LazyCopy - Combination of Both
 * 2. ShadowCopy - Same Moreover
 * 3. DeepCopy - Now Seeing
 */

//A Java program to demonstrate deep copy
//using clone()
import java.util.ArrayList;

//An object reference of this class is
//contained by Test2
class Test1 {
	int x, y;
}

//Contains a reference of Test and implements
//clone with deep copy.
class Test2 implements Cloneable {
	int a, b;

	Test1 c = new Test1();

	public Object clone() throws CloneNotSupportedException
	{
		// Assign the shallow copy to new reference variable
		// t
		Test2 t = (Test2)super.clone();

		t.c = new Test1();

		// Create a new object for the field c
		// and assign it to shallow copy obtained,
		// to make it a deep copy
		return t;
	}
}

public class DeepCopy {
	public static void main(String args[])
		throws CloneNotSupportedException
	{
		Test2 t1 = new Test2();
		t1.a = 10;
		t1.b = 20;
		t1.c.x = 30;
		t1.c.y = 40;

		Test2 t3 = (Test2)t1.clone();
		t3.a = 100;

		// Change in primitive type of t3 will not
		// be reflected in t1 field
		t3.c.x = 300;

		// Change in object type field of t3 will not
		// be reflected in t1(deep copy)
		System.out.println(t1.a + " " + t1.b + " " + t1.c.x
						+ " " + t1.c.y);
		System.out.println(t3.a + " " + t3.b + " " + t3.c.x
						+ " " + t3.c.y);
		
		Test1 t0 = new Test1();
		System.out.println(t0.x + " " + t0.y);

	}
}
