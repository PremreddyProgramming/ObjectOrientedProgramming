package countertopclient;

import countertopabstractfactory.BathroomCountertopFactory;
import countertopabstractfactory.CountertopAbstractFactory;
import countertopabstractfactory.CountertopFactory;
import countertopabstractfactory.KitchenCountertopFactory;
import countertops.BathroomCounterTops;
import countertops.Countertop;

public class CountertopDesign {

	public static void main(String[] args) {
	
		//Bathroom Countertop Designs
		Countertop BathroomDesign1 = CountertopFactory.createCountertop(new BathroomCountertopFactory("Green","Tiles","25 sft"));
		Countertop BathroomDesign2 = CountertopFactory.createCountertop(new BathroomCountertopFactory("Voilet", "Flat", "50 sft"));

		//Kitchen Countertop Designs
		
		Countertop KitchenDesign1 = CountertopFactory.createCountertop(new KitchenCountertopFactory("Green","Tiles","25 sft"));
		Countertop KitchenDesign2 = CountertopFactory.createCountertop(new KitchenCountertopFactory("Flat","Voilet","50 sft"));
		
		System.out.println("Following are the Countertop Designs for Bathrooms:::");
		
		// System.out.println("Bathroom Counter Top Design 1"+ "- " + BathroomDesign1.getStyle()+ ","+BathroomDesign1.getColor() + ","+BathroomDesign1.getSize());
		System.out.println("Bathroom Counter Top Design 2"+ "- " + BathroomDesign2.getColor()+ ","+BathroomDesign1.getStyle() +","+BathroomDesign2.getSize());
	
	
		System.out.println("\n"+"--------------------------------------------------------"+ "\n");
		System.out.println("Following are the Countertop Designs for Kitchen:::");
		System.out.println("Kitchen Counter Top Design 1"+ "- " + KitchenDesign1.getColor()+ ","+KitchenDesign1.getStyle()+"," + KitchenDesign1.getSize());
		System.out.println("Kitchen Counter Top Design 2"+ " -" + KitchenDesign2.getColor()+ ","+ KitchenDesign2.getStyle() +","+KitchenDesign2.getSize());
	
		
	}
}