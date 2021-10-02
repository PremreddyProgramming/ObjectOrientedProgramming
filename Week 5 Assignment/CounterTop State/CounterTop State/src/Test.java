
public class Test {

	public static void main(String[] args) 
	{
		CounterTop ct = new CounterTop(3);
		 System.out.println(ct);
		 
		 ct.available();
		 ct.sold();
		 
		 System.out.println(ct);
		 ct.bought(5);
		 ct.available();
		 ct.sold();
		 System.out.println(ct);

	}

}
