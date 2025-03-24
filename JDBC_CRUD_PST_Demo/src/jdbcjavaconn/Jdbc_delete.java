package jdbcjavaconn;
import java.sql.*;
import java.util.Scanner;
public class Jdbc_delete 
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
			System.out.println("Enter EMP ID to be deleted:");
			int empid = sc.nextInt();
			query="delete from staff WHERE empid="+empid;
			st=con.createStatement();
			st.executeUpdate(query);
			System.out.println("Data Deleted Succesfully");
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		

	}

}
