package riskmanagement.organization;

public class AbcCorporation implements Organization {

	@Override
	public String getOrgRiskScore() {
		return "2";
	}

	@Override
	public String getOrgHistory() {
		
		return "ABC Corporation reputed for 10 years - low risk score";
	}

}
