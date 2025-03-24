package preparedstmt;
import java.sql.*;
import java.util.Scanner;
public class Ps_Jdbc_update 
{

	public static void main(String[] args) throws SQLException 
	{
		try 
		{
			Connection con=null;
			PreparedStatement pst=null;
		
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
			query="update staff set name=? WHERE empid=?";
			pst=con.prepareStatement(query);
			pst.setString(1,ename);
			pst.setInt(2, empid);
			pst.executeUpdate();
			System.out.println("Data Updated Succesfully");
			pst.close();
			con.close();
			
		} catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		

	}

}
