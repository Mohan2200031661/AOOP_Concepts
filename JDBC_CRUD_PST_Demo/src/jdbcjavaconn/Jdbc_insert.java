package jdbcjavaconn;
import java.sql.*;
import java.util.Scanner;
public class Jdbc_insert 
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
			System.out.println("Enter EMP ID:");
			int empid = sc.nextInt();
			System.out.println("Enter EMP Name:");
			String ename = sc.next();
			query="insert into staff values("+empid+",'"+ename+"')";
			st=con.createStatement();
			st.executeUpdate(query);
			System.out.println("Data Inserted Succesfully");
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		

	}

}
