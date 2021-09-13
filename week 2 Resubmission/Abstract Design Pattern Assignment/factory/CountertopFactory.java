package counter.tops.factory;

public class CountertopFactory {
	
	public static Countertop createCountertop(CountertopAbstractFactory ctaf) {
              return ctaf.createCountertop();
}
	
}
