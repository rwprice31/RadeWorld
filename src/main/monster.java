package main;

public class monster   {
	
	private double encounterRate;
	private boolean dead;
	private String monsterWeakness;
	private String monsterName;
	
	public monster(boolean dead, double encounterRate, String monsterName,String monsterWeakness) {
		
		this.setDead(dead);
		this.setEcounterRate(encounterRate);
		this.setMonsterName(monsterName);
		this.setMonsterWeakness(monsterWeakness);
	}

	public double getEncouterRate() {
		return encounterRate;
	}

	public void setEcounterRate(double encounterRate) {
		this.encounterRate = encounterRate;
	}
	
	public String  getMonsterName(){
		return monsterName;
	}
	
	public String getmonsterWeakness(){
		return monsterWeakness;
	}
	
	public void setMonsterName(String monsterName){
		this.monsterName = monsterName;
	}
	
	public void setMonsterWeakness(String monsterWeakness){
		this.monsterWeakness = monsterWeakness;
	}
	
	public boolean getDead(){
		return dead;
	}
	
	public void setDead(boolean dead){
		this.dead = dead;
	}
}