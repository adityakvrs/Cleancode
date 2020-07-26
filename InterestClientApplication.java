package com.epam.interest;
import java.util.*;
public class InterestClientApplication
 {
     public static void main(String[] args)
     {
         Interest i=new Interest();
    	 Scanner sc=new Scanner(System.in);

        System.out.println("Enter S for simple interest or C for compound interest");

        switch (sc.next()){
            case "S":
		//calculate simple interest
                System.out.println("Enter \"Principal Amount\" , \"Duration in Years\" and \"Rate of Interest\"...");
                System.out.println(i.calculateSimpleInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                break;

            case "C":
		//calculate compound interest
                System.out.println("Enter \"Principal Amount\" , \"Duration in Years\" and \"Rate of Interest\"...");
                System.out.println(i.calculateCompoundInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                break;

            default:
                System.err.println("Wrong Choice...");
        
         
     }
}
 }