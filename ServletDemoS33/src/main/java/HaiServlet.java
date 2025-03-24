import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HaiServlet")
public class HaiServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public HaiServlet() 
    {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//Step 1: Set the Content Type as "text/html"
		response.setContentType("text/html");
		//Step 2: Create a PrintWriter Object
		PrintWriter pw = response.getWriter();
		//Step 3: Print the Name
		
		pw.print("<html>"
				+ "<head>"
				+ "	<title>Mathematics</title>"
				+ "</head>"
				+ "<body>"
				+ "	<H1>Printing Even Numbers till 20</H1>");
		
		for(int i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				pw.print("<br>"+i+"</br>");
			}
		}
		
		pw.print("</body>"
				+ "</html>");
		//Step 4: Close the PrintWriter Object
		pw.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		doGet(request, response);
	}

}
