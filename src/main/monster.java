package main;

public class monster extends characters {
	
	private double encounterRate;
	private boolean dead;
	private String monsterWeakness;
	private String monsterName;
	
	public monster(boolean dead, double encounterRate, String monsterName) {
		super(dead, encounterRate, monsterName);
		
	}

	public double getEncouterRate() {
		return encounterRate;
	}

	public void setEcounterRate(double encounterRate) {
		this.encounterRate = encounterRate;
	}
}