package riskmanagement.organization;

public class PqrCorporation implements Organization{

	@Override
	public String getOrgRiskScore() {
		return "12";
	}

	@Override
	public String getOrgHistory() {
		// TODO Auto-generated method stub
		return "Medium risk org for 5 years";
	}

}
