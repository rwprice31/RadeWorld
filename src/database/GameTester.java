package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GameTester 
{
	private static Connection conn = null;
	private static Statement stmt = null;
	
	public static void main(String[] args) 
	{
		String sDriver = "org.sqlite.JDBC";
		try
		{
			Class.forName(sDriver);
		}
		catch(ClassNotFoundException cnfe)
		{
			System.out.println(cnfe.getMessage());
		}
		String tempDB = "Game.db";
		String jdbc = "jdbc:sqlite";
		String dbURL = jdbc + ":" + tempDB;
			
		//Set db timeout
		int timeOut = 30;
		try
		{
		//Establish a connection to the database
			conn = DriverManager.getConnection(dbURL);
			//Create a container for the SQL statement
			stmt = conn.createStatement();
			//Set timeout on the statement
			stmt.setQueryTimeout(timeOut);
		}
		catch (SQLException sqe)
		{
		System.out.println(sqe.getMessage());
		}
		
		String sql = "Select * from rooms";
		ResultSet rs = null;
		try
		{
			rs = stmt.executeQuery(sql);
		} 
		catch (SQLException sqe)
		{
			sqe.printStackTrace();
		}

		try
		{
			while(rs.next())
			{
				System.out.println("The room number is " + rs.getInt("RoomNumber"));
				System.out.println("The room name is " + rs.getString("roomName"));
				System.out.println("The room is " + rs.getString("Description"));
				System.out.println("The room exits are " + rs.getString("Exits") + "\n");	
			}
		}
		catch (SQLException sqe)
		{
			System.out.println(sqe.getMessage());
		}


	}

}
