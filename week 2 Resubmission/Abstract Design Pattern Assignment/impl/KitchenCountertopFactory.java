package counter.tops.factory.impl;

import counter.tops.factory.Countertop;
import counter.tops.factory.CountertopAbstractFactory;

public class KitchenCountertopFactory implements CountertopAbstractFactory{

	@Override
public Countertop createCountertop() {
	
	return (Countertop) new KitchenCounterTops(this.Color,this.Style,this.Size);
	
}
	public String Color;
	public String Style;
	public String Size;
		
		public KitchenCountertopFactory (String Color,String Style,String Size) {
			// TODO Auto-generated method stub
			 this.Color =Color;
			 this.Style= Style;
			 this.Size= Size;
			
		}
	
}

