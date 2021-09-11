package countertopabstractfactory;

import countertops.Countertop;

public class CountertopFactory {
	
	public static Countertop createCountertop(CountertopAbstractFactory ctaf) {
              return ctaf.createCountertop();
}
	
}
