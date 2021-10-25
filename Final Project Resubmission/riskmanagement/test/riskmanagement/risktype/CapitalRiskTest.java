package riskmanagement.risktype;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CapitalRiskTest {
	
	@Test
	public void testCalculateImpact() {
		AbstractRisk risk = new CapitalRisk();
		assertEquals(risk.calculateImpact().getRiskScore(),20);
	}

}
