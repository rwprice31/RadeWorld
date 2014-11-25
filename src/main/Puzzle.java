package main;

public class Puzzle {
	
	private String puzzleDescription;
	private int roomNumber;
	private String puzzleAnswer;
	
	public Puzzle(String puzzleDecscription, int roomNumber, String puzzleAnswer){
		this.setPuzzleAnswer(puzzleAnswer);
		this.setPuzzleDescription(puzzleDecscription);
		this.setRoomNumber(roomNumber);
	}
	
	public String getPuzzleDescription(){
		return puzzleDescription;
	}
	public void setPuzzleDescription(String puzzleDescription ){
		this.puzzleDescription = puzzleDescription;
		}
	
	public int getRoomNumber(){
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber){
		this.roomNumber = roomNumber;
	}
	
	public String getPuzzleAnswer(){
		return puzzleAnswer;
	}
	
	public void setPuzzleAnswer(String puzzleAnswer){
		this.puzzleAnswer = puzzleAnswer;
	}
	}
