package riskmanagement.model;

import riskmanagement.enums.LikelihoodEnum;
import riskmanagement.enums.Rating;
import riskmanagement.enums.SeverityEnum;

public class RiskMatrixEntry {
	
	private LikelihoodEnum likelihoodEnum;
	
	private SeverityEnum severityEnum;
	
	private int value;
	
	private Rating rating;
	
	public RiskMatrixEntry(LikelihoodEnum likelihoodEnum, SeverityEnum severityEnum, int value, Rating rating) {
		this.likelihoodEnum = likelihoodEnum;
		this.severityEnum = severityEnum;
		this.value = value;
		this.rating = rating;
	}

	public LikelihoodEnum getLikelihoodEnum() {
		return likelihoodEnum;
	}

	public void setLikelihoodEnum(LikelihoodEnum likelihoodEnum) {
		this.likelihoodEnum = likelihoodEnum;
	}

	public SeverityEnum getSeverityEnum() {
		return severityEnum;
	}

	public void setSeverityEnum(SeverityEnum severityEnum) {
		this.severityEnum = severityEnum;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "RiskMatrixEntry [likelihoodEnum=" + likelihoodEnum + ", severityEnum=" + severityEnum + ", value="
				+ value + ", rating=" + rating + "]";
	}

	
	
	

}
