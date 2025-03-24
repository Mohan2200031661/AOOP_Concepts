package controller;


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

import entity.DBEntity;
import model.DBCRUDLogic;


@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Insert() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		try
		{
			String un = request.getParameter("dun");
			String pwd = request.getParameter("dpwd");
			DBEntity dbins = new DBEntity();
			dbins.setUsername(un);
			dbins.setPassword(pwd);
			DBCRUDLogic dblins = new DBCRUDLogic();
			boolean status = dblins.insertData(dbins);
			if (status)
			{
			String SendUN;
			SendUN = "inserted";
			request.setAttribute("ack", SendUN);
			RequestDispatcher rd = request.getRequestDispatcher("ackmnt.jsp");
			rd.forward(request, response);
			}
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
