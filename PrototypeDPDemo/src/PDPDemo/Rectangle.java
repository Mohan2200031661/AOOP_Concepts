package PDPDemo;
//Step2: Create concrete classes extending the above class. (Rectangle.java, Square.java, & Circle.java)
public class Rectangle extends Shape 
{
	   public Rectangle()
	   {
	     type = "Rectangle";
	   }

	   @Override
	   public void draw() 
	   {
	      System.out.println("Inside Rectangle::draw() method.");
	   }
}
