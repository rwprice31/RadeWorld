package main;

public class player   {
	private boolean dead;
	private String choice;
	private String heroName;

	public player(boolean dead, String choice, String heroName){	
		this.setCharacterName(heroName);
		this.setChoice(choice);
		this.setDead(dead);
	}
	
	
	
	public String  getCharacterName(){
		return heroName;
	}
	
	
	public void setCharacterName(String heroName){
		this.heroName = heroName;
	}
	
	
	
	public boolean getDead(){
		return dead;
	}
	
	public void setDead(boolean dead){
		this.dead = dead;
	}
public String getChoice(){
	return choice;
}

public void setChoice(String choice){
	this.choice = choice;
}
}