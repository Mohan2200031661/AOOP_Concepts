package PDPDemo;
//Step2: Create concrete classes extending the above class. (Rectangle.java, Square.java, & Circle.java)
public class Square extends Shape 
{
	   public Square()
	   {
	     type = "Square";
	   }

	   @Override
	   public void draw() 
	   {
	      System.out.println("Inside Square::draw() method.");
	   }
}
