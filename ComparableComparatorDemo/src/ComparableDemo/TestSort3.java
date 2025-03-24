package ComparableDemo;
import java.util.ArrayList;
import java.util.Collections;

//Creating a test class to sort the elements  
public class TestSort3
{  
	public static void main(String args[])
	{  
		/*Student s1 = new Student(101, "Tina", 26);
		Student s2 = new Student(104, "Jefrey", 29);
		Student s3 = new Student(102, "Howkin", 31);
		Student s4 = new Student(221, "Jenney", 21);*/
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101, "Tina", 26));
		al.add(new Student(104, "Jefrey", 29));
		al.add(new Student(102, "Howkin", 31));
		al.add(new Student(221, "Jenney", 21));
		Collections.sort(al);
		for(Student st:al)
		{  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}  
}  