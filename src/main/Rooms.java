package main;

public class Rooms {

	private String description;
	private String roomName;
	private String exits;
	private int roomNumber;

	public Rooms(String roomName, int roomNum, String description, String exits) {
		this.setDescription(description);
		this.setRoomName(roomName);
		this.setRoomNumber(roomNum);
		this.setExits(exits);

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExits() {
		return exits;
	}

	public void setExits(String exits) {
		this.exits = exits;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
}