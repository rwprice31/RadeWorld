package database;

import java.sql.ResultSet;
import java.sql.SQLException;

import main.Rooms;

/**Class: 
 * @author Rick Price
 * @version 1.0
 * Course : ITEC XXXX Fall 2014
 * Written: August 18, 2014
 *
 *
 * This class – now describe what the class does
 *
 * Purpose: – Describe the purpose of this class
 */

public class RoomsDB
{
	private String description;
	private String roomName;
	private String exits;
	private int roomNumber;
	private TestDB db = new TestDB();

	public Rooms getRoom(int roomNumber) throws SQLException
	{	
		//Assumes roomNumber is primary key for Rooms
		String sql = ("Select * from rooms where RoomNumber = " + roomNumber);
		
		ResultSet rs = db.query(db, sql); 
		description = rs.getString("Description");
		roomName = rs.getString("roomName");
		exits = rs.getString("exits");
		
		Rooms rm = new Rooms(roomName, roomNumber, description, exits);
		return rm;
	}
	
	public void createRoom(Rooms rm)
	{
		handleRoom(rm);
		String sql = "Insert into rooms (roomNumber, roomName, description, exits) values (" + roomNumber + ", \'" + roomName
				+ "\', \'" + description + "\', \'" + exits + "\')";
		db.modData(db, sql);
		
	}

	public void modifyRoom(Rooms rm)
	{
		handleRoom(rm);
		String sql = "Update rooms set roomNumber = " + roomNumber + ", roomName = \'"+  roomName + "\', description = \'" + 
		description + "\' rxits = " + exits;
	}
	private void handleRoom(Rooms rm)
	{
		description = rm.getDescription();
		roomNumber = rm.getRoomNumber();
		roomName = rm.getRoomName();
		exits = rm.getExits();
	}

}
