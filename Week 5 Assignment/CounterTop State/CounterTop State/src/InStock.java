
public class InStock implements State {
	
	CounterTop ct;
	public InStock(CounterTop ct)
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
	}
	public void bought()
	{
		System.out.println("Counter Tops are In Stock do not need to buy");
	}
	
	public String toString() 
	{
		return "IN STOCK";
	}
}
