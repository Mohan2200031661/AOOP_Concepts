package controller;


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

import entity.DBEntity;
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
		try
		{
			String un = request.getParameter("dun");
			String pwd = request.getParameter("dpwd");
			DBEntity dbins = new DBEntity();
			dbins.setUsername(un);
			dbins.setPassword(pwd);
			DBCRUDLogic dblins = new DBCRUDLogic();
			boolean status = dblins.deleteData(dbins);
			if (status)
			{
			String SendUN;
			SendUN = "deleted";
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
