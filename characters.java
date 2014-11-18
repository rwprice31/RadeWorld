package GamePackage;

public class characters  {
	
	private boolean dead;
	private String name;
	
	public characters(boolean dead, double encounterRate, String name){
		this.setDead(dead);
		
		
	}
	
	public boolean getDead(){
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
		
	}
	
	
	
	public String getName(){
		return name;
	}

}



