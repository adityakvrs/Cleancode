package com.epam.houseconstruction;
import java.util.Scanner;
public class ClientApplication {
    
	public static void main(String[] args) {
	    	String material;
	    	double square_feet;
	    	boolean automate;
	    	Construction c = new Construction();
		Scanner input=new Scanner(System.in);
		material=input.next();
		square_feet=input.nextDouble();
		automate=input.nextBoolean();
		if(automate==false) {

		//calculate cost of not automated
		
		double total_cost = c.constructionCost(material,square_feet,automate);
		
		}
		
		else {

		//Calculate cost using high standard material and fully automated
			
		double total_cost= c.constructionCost(material, square_feet,automate);
		}
		
		
	}

}