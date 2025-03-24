package controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.DBEntity;
import model.DBCRUDLogic;


@WebServlet("/LogVal")
public class LogVal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LogVal() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		try
		{
		
		String servun = request.getParameter("unjsp");
		String servpwd = request.getParameter("pwjsp");
		DBEntity dbe = new DBEntity();
		dbe.setUsername(servun);
		dbe.setPassword(servpwd);
		DBCRUDLogic dblg =new DBCRUDLogic();
		boolean status = dblg.DBValidate(dbe);
			if(status)
			{
				response.sendRedirect("dashboard.jsp");
			}
			else
			{
				pw.print("<html>"
						+ "<head>"
						+ "	<title>Login Error!!!</title>"
						+ "</head>"
						+ "<body>"
						+ "	<h1>INVALID CREDENTIALS</h1>"
						+ "	<a href='index.jsp'>Click Here to Go Back!</a>"
						+ "</body>"
						+ "</html>");
			}
		}
		catch (ClassNotFoundException e)
		{
			pw.print(e);
		}
		catch (SQLException e)
		{
			pw.print(e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
