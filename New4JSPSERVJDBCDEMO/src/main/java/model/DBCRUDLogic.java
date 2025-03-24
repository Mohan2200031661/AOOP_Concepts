package model;
import java.sql.*;
import java.util.*;

import entity.DBEntity;
public class DBCRUDLogic 
{
		
		String dburl = "jdbc:postgresql://localhost:5432/postgres";
		String dbun = "postgres";
		String dbpw = "klu@123";
		Connection con =null;
		PreparedStatement ps = null;
		Statement ss = null;
		ResultSet rs = null;
		
		public boolean DBValidate (DBEntity md) throws Exception
		{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(dburl, dbun,dbpw);
			ss = con.createStatement();

			rs = ss.executeQuery("select count(*) from public.\"login\" where username ='"+md.getUsername()+"' and password ='"+md.getPassword()+"'");
			if(rs.next())
			{
				if(rs.getInt(0)==1)
				{
				
					return true;
				}
				else if(rs.getInt(0)==0)
				{	
					return false;
				}
			}
			
		}
		public List<DBEntity> DBgetALL () throws Exception
		{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(dburl, dbun,dbpw);
			ps = con.prepareStatement("select * from public.\"login\"");
			rs = ps.executeQuery();
			List<DBEntity> L = new ArrayList<DBEntity>();
			while(rs.next())
			{
				DBEntity md = new DBEntity();
				md.setUsername(rs.getString(1));
				md.setPassword(rs.getString(2));
				L.add(md);
			}
			con.close();
			return L;
			
			
		}
		public boolean insertData (DBEntity md) throws Exception
		{
			Class.forName("org.postgresql.Driver");
			try {
			con = DriverManager.getConnection(dburl, dbun,dbpw);
			Statement st = con.createStatement();
			 st.executeUpdate("insert into public.\"login\" values ('"+md.getUsername()+"','"+md.getPassword()+"')");
			return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		public boolean updateData (DBEntity md) throws Exception
		{
			
			try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(dburl, dbun,dbpw);
			ps = con.prepareStatement("update public.\"login\" set password=? where username=?");
			ps.setString(1, md.getPassword());
			ps.setString(2,md.getUsername());
			 ps.execute();
			return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		public boolean deleteData (DBEntity md) throws Exception
		{
			try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(dburl, dbun,dbpw);
			ps = con.prepareStatement("delete from public.\"login\" where username=?");
			ps.setString(1, md.getUsername());
			 ps.execute();
			return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		public List<DBEntity> searchData (String S) throws Exception
		{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(dburl, dbun,dbpw);
			ps = con.prepareStatement("select * from public.\"login\" where username=?");
			ps.setString(1, S);
			rs = ps.executeQuery();
			List<DBEntity> L = new ArrayList<DBEntity>();
			while(rs.next())
			{
				DBEntity mdout = new DBEntity();
				mdout.setUsername(rs.getString(1));
				mdout.setPassword(rs.getString(2));
				L.add(mdout);
			}
			con.close();
			return L;
			
			
		}
	}
