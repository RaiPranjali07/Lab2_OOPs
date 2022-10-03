package Lab_2;

public class Pizza extends OrderingSystem {
	 private String size;
	 private String crust;
	 private String flavor;
	 
	
	 private boolean toppings;
	 private String toppingtype;
	 
	 public String getFlavor() {
			return flavor;
		}
		public void setFlavor(String flavor) {
			this.flavor = flavor;
		}
		  
	 
	 public String getToppingtype() {
		return toppingtype;
	}
	public void setToppingtype(String toppingtype) {
		this.toppingtype = toppingtype;
	}
	public String getSize() {
		return size; 
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCrust() {
		return crust;
	}
	public void setCrust(String crust) {
		this.crust = crust;
	}

	public boolean getToppings() {
		return toppings;
	}
	public void setToppings(boolean toppings) {
		this.toppings = toppings;
	}


	@Override
	public int calcprice(String flavor) {
		if(getFlavor().equals("Vegetarian"))
		{
			if(getSize().equals ("Small"))
				cost+=20;
			if(getSize().equals ("Medium"))
				cost+=40;
			if(getSize().equals ("Large"))
				cost+=60;
		}
		else if(getFlavor().equals("NonVegetarian"))
		{
			if(getSize().equals ("Small"))
				cost+=25;
			if(getSize().equals ("Medium"))
				cost+=50;
			if(getSize().equals ("Large"))
				cost+=75;
		}
		else if(getFlavor().equals("Vegan"))
		{
			if(getSize().equals ("Small"))
				cost+=15;
			if(getSize().equals ("Medium"))
				cost+=30;
			if(getSize().equals ("Large"))
				cost+=45;
		}
		if(getToppings()==true)
			cost+=1;
return cost;	
	}
	  
}
