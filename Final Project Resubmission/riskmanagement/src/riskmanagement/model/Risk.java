package riskmanagement.model;

public class Risk {
	
	private String riskId;
	
	private int riskScore;
	
	public Risk(String riskId) {
		this.riskId = riskId;
	}
	
	public Risk(String riskId, int riskScore) {
		this.riskId = riskId;
		this.riskScore = riskScore;
	}

	public String getRiskId() {
		return riskId;
	}

	public void setRiskId(String riskId) {
		this.riskId = riskId;
	}

	public int getRiskScore() {
		return riskScore;
	}

	public void setRiskScore(int riskScore) {
		this.riskScore = riskScore;
	}

	@Override
	public String toString() {
		return "Risk [riskId=" + riskId + ", riskScore=" + riskScore + "]";
	}
	
	
	

}
