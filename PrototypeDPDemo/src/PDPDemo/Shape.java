package PDPDemo;
//Step1: Create an abstract class implementing Cloneable interface. (Shape.java)
public abstract class Shape implements Cloneable 
{
	   private String id;
	   protected String type;
	   
	   abstract void draw();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Object clone() 
	{
	      Object clone = null;
	      
	      try 
	      {
	         clone = super.clone();
	         
	      } 
	      catch (CloneNotSupportedException e) 
	      {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }
}
