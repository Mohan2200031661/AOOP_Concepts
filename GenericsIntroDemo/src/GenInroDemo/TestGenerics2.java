package GenInroDemo;
//Now we are going to use map elements using generics. Here, we need to pass key and value. 
//Let us understand it by a simple example:

import java.util.*;

public class TestGenerics2 {

	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer,String>();  
		map.put(1,"vijay");  
		map.put(4,"umesh");  
		map.put(2,"ankit");  
		//Now use Map.Entry for Set and Iterator  
		Set<Map.Entry<Integer,String>> set=map.entrySet();  
		Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
		while(itr.hasNext())
		{  
			Map.Entry e=itr.next();//no need to typecast  
			System.out.println(e.getKey()+" "+e.getValue());  
		}  
	}
}
