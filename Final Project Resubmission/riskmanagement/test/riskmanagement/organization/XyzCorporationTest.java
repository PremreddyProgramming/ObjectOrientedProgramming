package riskmanagement.organization;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class XyzCorporationTest {
	
	@Test
	public void testOrgHistory() {
		Organization organization = new XyzCorporation();
		assertEquals(organization.getOrgHistory(),"Very risky organization and newbie");
	}
	
	@Test
	public void testOrgRiskScore() {
		Organization organization = new XyzCorporation();
		assertEquals(organization.getOrgRiskScore(),"25");
	}

}
