package GenInroDemo;

import java.util.ArrayList;
import java.util.Iterator;
//TYPE SAFETY DEMO
//Here, we are using the ArrayList class, but you can use any collection class such as ArrayList, LinkedList, HashSet, TreeSet, HashMap, Comparator etc.
public class TestGenerics1 
{
	public static void main(String args[])
	{  
		ArrayList<String> list=new ArrayList<String>();  
		list.add("NedStark");  
		list.add("Lannister");  
		//list.add(32);//compile time error  
		String s=list.get(1);//INDIVIDUAL type casting is not required  
		System.out.println("element is: "+s);  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}   
	}  

}
