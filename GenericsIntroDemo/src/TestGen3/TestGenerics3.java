package TestGen3;
//Use the generic class.
public class TestGenerics3 
{
	public static void main(String args[])
	{  
		MyGen<Integer> m1=new MyGen<Integer>();  
		MyGen<String> m2=new MyGen<String>();  
		m1.add(2);  
		m2.add("vivek"); 
		System.out.println(m1.get());
		System.out.println(m2.get());
	}
}
