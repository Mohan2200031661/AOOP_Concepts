package jdbcjavaconn;
import java.sql.*;
public class Jdbc_create 
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
			query="create table Staff(empid integer,name varchar(50))";
			st=con.createStatement();
			st.executeUpdate(query);
			System.out.println("Table Created Succesfully");
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		

	}

}
