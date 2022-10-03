package Lab_2;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int choice;	 
	   Pizza pizza=new Pizza();
	   Pasta pasta=new Pasta();
	   System.out.println("Menu");
	   System.out.println("1.Pizza");
	   System.out.println("2.Pasta");	 
	   
	   do {
		   System.out.println("Enter the item that you want to order");
		   choice=input.nextInt();
	  
   
   if(choice==1)
   {
	   System.out.println("Please enter size: Small/Medium/Large");
	   pizza.setSize(input.next());
	   System.out.println("Please enter crust type: Thin/thick");
	   pizza.setCrust(input.next());
	   System.out.println("Please enter flavor: Vegetarian/NonVegetarian/Vegan");
	   pizza.setFlavor(input.next());
	   System.out.println("Do you want toppings: true/false");
	   pizza.setToppings(input.nextBoolean());
	   System.out.println("Please select topping: Cheese/Mushrom/Tomato/Jalapeno/Spinach");
	   pizza.setToppingtype(input.next());
	   System.out.println("Total Cost:" +pizza.calcprice(pizza.getFlavor()));
   }
   //System.out.println("Total Cost:" +pizza.calcprice(pizza.getFlavor()));
    if(choice==2)
   {
      System.out.println("Please enter flavor: WhiteSauce or RedSauce");
      pasta.setPastaflavor(input.next());
      System.out.println("Please enter type: Penne/Ditalini");
      pasta.setTypes(input.next());
      System.out.println("Total cost:" +pasta.calcprice(pasta.getPastaflavor()));
   
	 }
    else
    	System.out.println("Thank You!!!");
}while(choice==1 ||choice==2);
}
}
	   
   

