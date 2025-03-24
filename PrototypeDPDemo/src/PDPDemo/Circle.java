package PDPDemo;
//Step2: Create concrete classes extending the above class. (Rectangle.java, Square.java, & Circle.java)
public class Circle extends Shape 
{
	   public Circle()
	   {
	     type = "Circle";
	   }

	   @Override
	   public void draw() 
	   {
	      System.out.println("Inside Circle::draw() method.");
	   }
}
