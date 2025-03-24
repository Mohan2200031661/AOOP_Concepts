

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	
	

    public LoginValidate() {
        super();

    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			Class.forName("org.postgresql.Driver"); 
			String dburl = "jdbc:postgresql://localhost:5432/aoopdb";
			String dbun = "postgres";
			String dbpw = "klu@123";
			Connection con = DriverManager.getConnection(dburl, dbun,dbpw);
			Statement ss = con.createStatement();
			String un = request.getParameter("lun");
			String pwd = request.getParameter("lpw");
			ResultSet rs = ss.executeQuery("select * from public.\"login\" where username ='"+un+"' and password ='"+pwd+"'");
			if(rs.next())
			{
				/*String SendUN;
				SendUN = request.getParameter("lun");
				request.setAttribute("res", SendUN);*/
				HttpSession session=request.getSession();  
		        session.setAttribute("name",un);
				RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
				rd.forward(request, response);
			}
			else
			{	
				response.setContentType("text/html");
				PrintWriter pw = response.getWriter();
				pw.print("Invalid Credentials!");
			}
		}
		catch(Exception E)
		{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();	
			pw.print(E);
		}		
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
