package countertopabstractfactory;

import countertops.BathroomCounterTops;
import countertops.Countertop;
import countertops.KitchenCounterTops;

public interface CountertopAbstractFactory {

	public Countertop createCountertop();

}
