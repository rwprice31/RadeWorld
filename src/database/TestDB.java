package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**Class: 
 * @author Rick Price
 * @version 1.0
 * Course : ITEC 3860 Fall 2014
 * Written: October 24, 2014
 *
 *
 * This class – uses the SQLite JDBC driver to access a SQLite database
 *
 * Purpose: – Demonstrate JDBC usage
 */

public class TestDB
{
	private Connection conn;
	private Statement stmt;
	private int timeOut;
	
	public TestDB()
	{
		//register the driver name
		String sDriver = "org.sqlite.JDBC";
		try
		{
			Class.forName(sDriver);
		}
		catch (ClassNotFoundException cfne)
		{
			System.out.println(cfne.getMessage());
		}
		
		//Build the URL for SQLite DB
		String tempDB = "Game.db";
		String jdbc = "jdbc:sqlite";
		String dbURL = jdbc + ":" + tempDB;
		
		//Set db timeout
		timeOut = 30;
		
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
	}
	
	/** Method: main
	 * 
	 * @param String[] args
	 * @return void
	 */
	public static void main(String[] args)
	{
		TestDB tdb = new TestDB();
		
		try
		{
			//Query the database.  Returns the results in a ResultSet
			ResultSet rs = tdb.query(tdb, "Select * from rooms");
			//Loop over the result set.  next moves the cursor to the next record and 
			//returns the current record
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
	
	public ResultSet query(TestDB tdb, String sql)
	{
		ResultSet rs = null;
		try
		{
			rs = tdb.stmt.executeQuery(sql);
		} 
		catch (SQLException sqe)
		{
			sqe.printStackTrace();
		}
		return rs;
	}
	
	public boolean modData(TestDB tdb, String sql)
	{
		boolean success = true;
		try
		{
			tdb.stmt.executeUpdate(sql);
		} 
		catch (SQLException sqe)
		{
			success = false;
			sqe.printStackTrace();
		}
		return success;
	}
}
