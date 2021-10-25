package riskmanagement.risktype;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CreditRiskTest {
	
	@Test
	public void testCalculateImpact() {
		AbstractRisk risk = new CreditRisk();
		assertEquals(risk.calculateImpact().getRiskScore(),30);
	}

}
