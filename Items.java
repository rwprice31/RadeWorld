package JDBC;

public class Items {
	
	private String name;
	private String description;
	
	public Items(String _name, String _description){
		name = _name;
		description = _description;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	

}
