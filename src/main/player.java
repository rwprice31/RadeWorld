package main;

public class player extends characters {
	private double encounterRate;

	public player(boolean dead, double encounterRate, String name) {
		super(dead, encounterRate, name);
		// TODO Auto-generated constructor stub
	}

	public double getEncouterRate() {
		return encounterRate;
	}

	public void setEcounterRate(double encounterRate) {
		this.encounterRate = encounterRate;
	}

}