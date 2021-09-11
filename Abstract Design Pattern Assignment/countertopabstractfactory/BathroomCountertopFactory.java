package countertopabstractfactory;

import countertops.BathroomCounterTops;
import countertops.Countertop;

public class BathroomCountertopFactory implements CountertopAbstractFactory{

	@Override
public Countertop createCountertop() {
	
	return new BathroomCounterTops(this.Color,this.Style,this.Size);
	
}
	
private String Color;
private String Style;
private String Size;
	
	public BathroomCountertopFactory (String color,String style, String size) {
		// TODO Auto-generated method stub
		 this.Color =color;
		 this.Style= style;
		 this.Size= size;
		
	}
	
}
