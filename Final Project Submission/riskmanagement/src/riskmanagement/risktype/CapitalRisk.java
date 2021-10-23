package riskmanagement.risktype;

import riskmanagement.command.RiskCommand;
import riskmanagement.command.RiskControl;
import riskmanagement.command.RiskLikelihoodCommand;
import riskmanagement.model.Risk;

public class CapitalRisk extends AbstractRisk{

	@Override
	public Risk calculateImpact() {
		// command pattern - market risk has severity alone
		
		RiskControl control = new RiskControl();
		Risk risk = new Risk("1");
		RiskCommand likelihood = new RiskLikelihoodCommand(risk);
		control.setCommand(likelihood);
		control.applyrisk();
					    
		return risk;
	}

}
