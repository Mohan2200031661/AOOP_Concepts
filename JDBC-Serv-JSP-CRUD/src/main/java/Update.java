

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Update() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		try
		{
			Class.forName("org.postgresql.Driver"); 
			String dburl = "jdbc:postgresql://localhost:5432/aoopdb";
			String dbun = "postgres";
			String dbpw = "klu@123";
			Connection con = DriverManager.getConnection(dburl, dbun,dbpw);
			Statement ss = con.createStatement();
			String un = request.getParameter("dun");
			String pwd = request.getParameter("dpwd");
			ss.executeUpdate("update public.\"login\" set password ='"+pwd+"' where username LIKE '"+un+"'");
			String SendUN;
			SendUN = "updated";
			request.setAttribute("ack", SendUN);
			RequestDispatcher rd = request.getRequestDispatcher("ackmnt.jsp");
			rd.forward(request, response);
		}
		catch(Exception E)
		{
			PrintWriter pw = response.getWriter();
			pw.print(E);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

}
