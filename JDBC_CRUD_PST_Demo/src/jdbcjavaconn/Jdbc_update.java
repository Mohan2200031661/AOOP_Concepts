package jdbcjavaconn;
import java.sql.*;
import java.util.Scanner;
public class Jdbc_update 
{

	public static void main(String[] args) throws SQLException 
	{
		try 
		{
			Connection con=null;
			Statement st=null;
			String query=null;
			String dburl="jdbc:postgresql://localhost:5432/AOOP";
			String dbun="postgres";
			String dbpw="admin";
			
			//Step: 1
			Class.forName("org.postgresql.Driver");
		   //step: 2
			con=DriverManager.getConnection(dburl,dbun,dbpw);
			//step:3
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter EMP ID to be searched for update:");
			int empid = sc.nextInt();
			System.out.println("Enter EMP Name to be updated :");
			String ename = sc.next();
			query="update staff set name='"+ename+"'WHERE empid="+empid;
			st=con.createStatement();
			st.executeUpdate(query);
			System.out.println("Data Updated Succesfully");
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		

	}

}
