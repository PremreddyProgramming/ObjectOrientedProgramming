package riskmanagement.factory;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import riskmanagement.risktype.CapitalRisk;
import riskmanagement.risktype.CreditRisk;
import riskmanagement.risktype.MarketRisk;

public class RiskFactoryTest {
	
	@Test
	public void testRiskFactoryPattern_CapitalRisk() {
		RiskFactory factory = new RiskFactory();
		assertTrue(factory.choose(1) instanceof CapitalRisk);
	}
	
	@Test
	public void testRiskFactoryPattern_CreditRisk() {
		RiskFactory factory = new RiskFactory();
		assertTrue(factory.choose(2) instanceof CreditRisk);
	}
	
	@Test
	public void testRiskFactoryPattern_MarketRisk() {
		RiskFactory factory = new RiskFactory();
		assertTrue(factory.choose(3) instanceof MarketRisk);
	}
	
	
	@Test
	public void testRiskFactoryPatternNull() {
		RiskFactory factory = new RiskFactory();
		assertNull(factory.choose(4));
	}

}
