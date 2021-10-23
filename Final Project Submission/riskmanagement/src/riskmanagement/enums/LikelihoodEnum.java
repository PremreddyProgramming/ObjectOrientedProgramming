package riskmanagement.enums;

public enum LikelihoodEnum {

	HIGHLY_PROBABLE(5), PROBABLE(4), OCCASIONAL(3), REMOTE(2), IMPROBABLE(1);

	LikelihoodEnum(int value) {
		this.value = value;
	}

	private int value;

	public int getValue() {
		return value;
	}
}
