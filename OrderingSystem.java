package Lab_2;

public abstract class OrderingSystem {
  private String item;
   int cost;
 // private String flavor;
  
  OrderingSystem()
  {}
  
  OrderingSystem(String item)
  {
	  this.item=item;
	  cost=0;
  }
  
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}

  
  public abstract int calcprice(String flavor);
  
   
}
