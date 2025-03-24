

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServDiv")
public class ServDiv extends HttpServlet 
{
	private static final long serialVersionUID = 1L;   
    public ServDiv() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int v1 = Integer.parseInt(request.getParameter("va"));
		int v2 = Integer.parseInt(request.getParameter("vb"));
		int res = v1/v2;
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("<html><head><title>RESULT</title></head><body>");
		pw.print("<h1>The Addition Value is "+res+"</h1>");
		pw.print("<a href='index.jsp'> Click Here to Go Back</a></body></html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

}
