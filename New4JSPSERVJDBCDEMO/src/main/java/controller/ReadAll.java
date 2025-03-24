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
@WebServlet("/ReadAll")
public class ReadAll extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ReadAll() {
        super();
       
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try
		{
			DBCRUDLogic dblreadall = new DBCRUDLogic();
			List<DBEntity> l1 = new ArrayList<DBEntity>();
			l1 = dblreadall.DBgetALL();
		
			request.setAttribute("res2", l1);
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
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
