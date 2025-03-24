package jdbcjavaconn;
import java.sql.*;
import java.util.Scanner;
public class Jdbc_select 
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
			
			query="select * from staff";
			st=con.createStatement();
			rs=st.executeQuery(query);
			while (rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				System.out.println("ID: " + id);
				System.out.println("Name: " + name);
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
