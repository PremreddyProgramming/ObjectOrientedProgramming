package riskmanagement.factory;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import riskmanagement.organization.AbcCorporation;

public class OrganizationFactoryTest {
	
	@Test
	public void testOrganizationFactoryPattern_AbcCorporationImpl() {
		OrganizationFactory factory = new OrganizationFactory();
		assertTrue(factory.choose(1) instanceof AbcCorporation);
	}
	
	@Test
	public void testOrganizationFactoryPattern_PqrCorporationImpl() {
		OrganizationFactory factory = new OrganizationFactory();
		assertTrue(factory.choose(1) instanceof AbcCorporation);
	}
	
	@Test
	public void testOrganizationFactoryPattern_XyzCorporationImpl() {
		OrganizationFactory factory = new OrganizationFactory();
		assertTrue(factory.choose(1) instanceof AbcCorporation);
	}
	
	
	@Test
	public void testOrganizationFactoryNull() {
		OrganizationFactory factory = new OrganizationFactory();
		assertNull(factory.choose(4));
	}
}
