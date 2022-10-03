package Lab_2;

public class Pasta extends OrderingSystem {
	  
	  private String types;
	  private String Pastaflavor;
	  

		  

	
	public String getPastaflavor() {
		return Pastaflavor;
	}
	public void setPastaflavor(String pastaflavor) {
		Pastaflavor = pastaflavor;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	@Override
	public int calcprice(String flavor) {
		if(getPastaflavor().equals("WhiteSauce"))
			cost+=10;
		else if(getPastaflavor().equals("RedSauce"))
			cost+=20;
		
	return cost;	
		
	}

}
