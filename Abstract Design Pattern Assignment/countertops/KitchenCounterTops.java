package countertops;

public class KitchenCounterTops implements Countertop {


	private String Color;
	private String Style;
	private String Size;
	
public KitchenCounterTops(String Color, String Style, String Size) {
		
		this.Color = Color;
		this.Style = Style;
		this.Size = Size;
		
	}

	@Override
	public String getColor() {
		
		return this.Color;
	}

	@Override
	public String getStyle() {
		
		return this.Style;
	}

	@Override
	public String getSize() {
		
		return this.Size;
	}
}
