
public class OutOfStock implements State{
	
	CounterTop ct;
	public OutOfStock(CounterTop ct)
	{
		this.ct=ct;
	}
	
	public void available()
	{
		System.out.println("Counter Tops are not Available... You need to buy more stock");
	}
	public void sold()
	{
		System.out.println("Counter Tops are Sold and Out of Stock");
	}
	public void bought()
	{
		System.out.println("Counter Tops are In Stock do not need to buy");
		ct.bought(10);
	}
	
	public String toString() 
	{
		return "Buying more Stock";
	}

}
