package riskmanagement.enums;

public enum SeverityEnum {
	
	CATASTROPHIC(5),SIGNIFICANT(4),MODERATE(3),LOW(2),NEGLIGIBLE(1);
	
	
	SeverityEnum(int value){
		this.value = value;
	}
	private int value;
	
	public int getValue() {
		return value;
	}

}
