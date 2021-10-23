package riskmanagement.factory;

import riskmanagement.abstractfactory.ChoiceAbstractFactory;
import riskmanagement.risktype.CapitalRisk;
import riskmanagement.risktype.CreditRisk;
import riskmanagement.risktype.MarketRisk;
import riskmanagement.risktype.AbstractRisk;

public class RiskFactory implements ChoiceAbstractFactory<AbstractRisk> {

	@Override
	public AbstractRisk choose(int choiceNumber) {
		if (choiceNumber == 1) {
			return new CapitalRisk();
		} else if (choiceNumber == 2) {
			return new CreditRisk();
		} else if (choiceNumber == 3) {
			return new MarketRisk();
		}

		return null;

	}

}