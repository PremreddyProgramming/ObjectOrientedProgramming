
public class Sold implements State{

	CounterTop ct;
	public Sold(CounterTop ct)
	{
		this.ct=ct;
	}
	
	public void available()
	{
		System.out.println("Counter Tops are Available and In stock");
	}
	public void sold()
	{
		System.out.println("Counter Tops are not sold yet");
		ct.topSold();
	}
	public void bought()
	{
		System.out.println("Counter Tops are In Stock do not need to buy");
	}
	
	public String toString() 
	{
		return "Top Sold";
	}
}
