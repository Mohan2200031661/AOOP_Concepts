package jdbcjavaconn;
import java.sql.*;
import java.util.Scanner;
public class Jdbc_search2 
{

	public static void main(String[] args) throws SQLException 
	{
		try 
		{
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			String query=null;
			String dburl="jdbc:postgresql://localhost:5432/AOOP";
			String dbun="postgres";
			String dbpw="admin";
			
			//Step: 1
			Class.forName("org.postgresql.Driver");
		   //step: 2
			con=DriverManager.getConnection(dburl,dbun,dbpw);
			//step:3
			System.out.println("Enter the employee id to search:");
			Scanner sc=new Scanner(System.in);
			int empid = sc.nextInt();
			query="select name from staff WHERE empid="+empid;
			st=con.createStatement();
			rs=st.executeQuery(query);
			while (rs.next())
			{
				String name=rs.getString(1);
				System.out.println("The Name of the given EMPID:"+ name);
			}
			rs.close();
 			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		

	}

}
