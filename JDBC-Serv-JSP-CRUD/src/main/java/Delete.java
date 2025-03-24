

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;

/**
 * Servlet implementation class ReadAll
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Delete() {
        super();
       
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		/*PrintWriter pw = response.getWriter();
		pw.print("Hello");*/
		try
		{
			Class.forName("org.postgresql.Driver");
			String dburl = "jdbc:postgresql://localhost:5432/aoopdb";
			String dbun = "postgres";
			String dbpw = "klu@123";
			Connection con = DriverManager.getConnection(dburl, dbun,dbpw);
			String un = request.getParameter("dun");
			PreparedStatement ps = con.prepareStatement("delete from public.\"login\" where username LIKE '"+un+"'");
			ps.execute();
			String SendUN;
			SendUN = "deleted";
			request.setAttribute("ack", SendUN);
			RequestDispatcher rd = request.getRequestDispatcher("ackmnt.jsp");
			rd.forward(request, response);
		}
		catch(Exception e)
		{
			PrintWriter pw = response.getWriter();
			pw.print(e);
		}
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
