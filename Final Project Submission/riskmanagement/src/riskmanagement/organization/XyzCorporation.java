package riskmanagement.organization;

public class XyzCorporation implements Organization{

	@Override
	public String getOrgRiskScore() {
		return "25";
	}

	@Override
	public String getOrgHistory() {
		return "Very risky organization and newbie";
	}

}
