package preparedstmt;
import java.sql.*;
import java.util.Scanner;
public class Ps_Jdbc_search 
{

	public static void main(String[] args) throws SQLException 
	{
		try 
		{
			Connection con=null;
			PreparedStatement pst=null;
		    ResultSet rs =null;
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
			query="select * from staff WHERE empid=?";
			pst=con.prepareStatement(query);
			pst.setInt(1, empid);
			rs=pst.executeQuery();
			while (rs.next())
			{
				int id=rs.getInt(1);
				String nam=rs.getString(2);
				System.out.println("ID: " + id);
				System.out.println("Name: " + nam);
			}
			rs.close();
 			pst.close();
			con.close();
			
		} catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		

	}

}
