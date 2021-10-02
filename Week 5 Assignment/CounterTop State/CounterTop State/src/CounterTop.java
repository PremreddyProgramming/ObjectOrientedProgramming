
public class CounterTop {
	
	State instock;
	State outofStock;
	State sold;
	
	State state;
	int count = 0;
	public CounterTop (int numberoftops)
	{
		instock = new InStock(this);
		outofStock = new OutOfStock(this);
		sold = new Sold(this);
		
		this.count = numberoftops;
		if(numberoftops>0)
		{
			state = instock;
		}
		else
		{
			state = outofStock;
		}
	}
	
	public void available()
	{
		state.available();
	}
	
	public void sold()
	{
		state.sold();
	}
	
	public void topSold()
	{
		System.out.println("A Counter top is released from stock");
		if(count>0)
		{
			count = count - 1;
		}
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void bought(int count)
	{
		this.count += count;
		System.out.println("Counter Tops are bought and now total stock is :: "+ this.count);
		state.bought();;
	}
	
	
	void setState(State state) 
	{
		this.state = state;
	}
	public State getState() 
	{
        return state;
    }

    public State getInStock() 
    {
        return instock;
    }

    public State getOutofStock() 
    {
        return outofStock;
    }
    public State getSold() 
    {
        return sold;
    }
    
    
    public String toString() 
    {
		StringBuffer result = new StringBuffer();
		result.append("\nCounter Top Limited Company.");
		result.append("\nJava-enabled CounterTop since 2021");
		result.append("\nInventory: " + count + " counter top");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("CounterTop is in " + state + "\n");
		return result.toString();
	}
	

}
