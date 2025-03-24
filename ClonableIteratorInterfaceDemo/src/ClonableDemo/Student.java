package ClonableDemo;


/*The Java.lang.Cloneable interface is a marker interface. It was introduced in JDK 1.0. There is a method clone() in the Object class. Cloneable interface is implemented by a class to make Object.clone() method valid thereby making field-for-field copy. This interface allows the implementing class to have its objects to be cloned instead of using a new operator. 

Declaration

public interface Cloneable

Example 1: Below program explains that If you will try to Clone an object which doesn’t implement the Cloneable interface, it will CloneNotSupportedException, which you may want to handle.*/

//Java program to Demonstrate the
//application of Cloneable interface

import java.io.*;
import java.util.*;

class Student {

	// attributes of Student class
	String name = null;
	int id = 0;

	// default constructor
	Student() {}

	// parameterized constructor
	Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args)
	{
		// create an instance of Student
		Student s1 = new Student("Ashish", 121);

		// Try to clone s1 and assign
		// the new object to s2
		Student s2;
		try {
			s2 = (Student) s1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
