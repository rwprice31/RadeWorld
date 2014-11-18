package GamePackage;

public class monster extends characters {
	private double encounterRate;
	
	public monster(boolean dead, double encounterRate, String name) {
		super(dead, encounterRate, name);
		// TODO Auto-generated constructor stub
	}

	
	public double getEncouterRate(){
		return encounterRate;
	}
	
	public void setEcounterRate(double encounterRate ){
		this.encounterRate = encounterRate;
	}
}