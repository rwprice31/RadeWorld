package main;

public class Rooms {

	private String description;
	private String roomName;
	private boolean cleared;
	private int roomNum;
	
	public Rooms (String roomName, int roomNum, String description, boolean cleared) {
		this.setDescription(description);
		this.setRoomName(roomName);
		this.setRoomNum(roomNum);
		this.setCleared(cleared);
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public boolean isCleared() {
		return cleared;
	}

	public void setCleared(boolean cleared) {
		this.cleared = cleared;
	}
	
	
}
