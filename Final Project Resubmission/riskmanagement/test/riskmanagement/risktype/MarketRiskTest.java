package riskmanagement.risktype;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MarketRiskTest {
	
	@Test
	public void testCalculateImpact() {
		AbstractRisk risk = new MarketRisk();
		assertEquals(risk.calculateImpact().getRiskScore(),10);
	}

}
