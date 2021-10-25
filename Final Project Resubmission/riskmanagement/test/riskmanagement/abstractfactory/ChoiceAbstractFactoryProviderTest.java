package riskmanagement.abstractfactory;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import riskmanagement.factory.OrganizationFactory;
import riskmanagement.factory.RiskFactory;

public class ChoiceAbstractFactoryProviderTest {
	
	@Test
	public void testChoiceAbstractFactoryProvider_OrganizationFactory() {
		assertTrue(ChoiceAbstractFactoryProvider.getFactory(1) instanceof OrganizationFactory);
		
	}
	
	@Test
	public void testChoiceAbstractFactoryProvider_RiskFactory() {
		assertTrue(ChoiceAbstractFactoryProvider.getFactory(2) instanceof RiskFactory);
		
	}
	
	@Test
	public void testChoiceAbstractFactoryProvider_Null() {
		assertNull(ChoiceAbstractFactoryProvider.getFactory(3));
		
	}

}
