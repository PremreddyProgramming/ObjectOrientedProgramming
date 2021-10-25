package riskmanagement.abstractfactory;

import riskmanagement.factory.OrganizationFactory;
import riskmanagement.factory.RiskFactory;

public class ChoiceAbstractFactoryProvider {
	
public static ChoiceAbstractFactory<?> getFactory(int choice){
        
        if(choice==1){
            return new OrganizationFactory();
        }
        else if(choice==2){
            return new RiskFactory();
        }
        
        return null;
    }
}
