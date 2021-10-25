package riskmanagement.factory;

import riskmanagement.abstractfactory.ChoiceAbstractFactory;
import riskmanagement.organization.AbcCorporation;
import riskmanagement.organization.Organization;
import riskmanagement.organization.PqrCorporation;
import riskmanagement.organization.XyzCorporation;

public class OrganizationFactory implements ChoiceAbstractFactory<Organization>{

	@Override
	public Organization choose(int choiceNumber) {
		
		if(choiceNumber==1) {
			return new AbcCorporation();
			
		}else if(choiceNumber==2) {
			return new PqrCorporation();
		}
		else if(choiceNumber==3) {
			return new XyzCorporation();
		}
		return null;
	}

}
