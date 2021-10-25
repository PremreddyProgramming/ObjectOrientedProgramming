package riskmanagement.organization;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AbcCorporationTest {
	
	@Test
	public void testOrgHistory() {
		Organization organization = new AbcCorporation();
		assertEquals(organization.getOrgHistory(),"ABC Corporation reputed for 10 years - low risk score");
	}
	
	@Test
	public void testOrgRiskScore() {
		Organization organization = new AbcCorporation();
		assertEquals(organization.getOrgRiskScore(),"2");
	}

}
