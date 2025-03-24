package ComparatorDemo;

import java.util.*;

import ComparatorDemo.Student;

import java.io.*;  
class TestComparator
{  
	public static void main(String args[])
	{  
		//Creating a list of students  
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101, "Tina", 26));
		al.add(new Student(104, "Jefrey", 29));
		al.add(new Student(102, "Howkin", 31));
		al.add(new Student(221, "Jenney", 21));
		  
		System.out.println("Sorting by Name");  
		//Using NameComparator to sort the elements  
		Collections.sort(al,new NameComparator());  
		//Traversing the elements of list  
		for(Student st: al)
		{  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("Sorting by Age");  
		//Using AgeComparator to sort the elements  
		Collections.sort(al,new AgeComparator());  
		//Traversing the list again  
		for(Student st: al)
		{  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	  
	}  
}  

