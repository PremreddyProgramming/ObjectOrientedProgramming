package riskmanagement.organization;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PqrCorporationTest {
	
	@Test
	public void testOrgHistory() {
		Organization organization = new PqrCorporation();
		assertEquals(organization.getOrgHistory(),"Medium risk org for 5 years");
	}
	
	@Test
	public void testOrgRiskScore() {
		Organization organization = new PqrCorporation();
		assertEquals(organization.getOrgRiskScore(),"12");
	}

}
