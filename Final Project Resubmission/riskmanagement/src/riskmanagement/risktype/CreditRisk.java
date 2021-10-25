package riskmanagement.risktype;

import riskmanagement.command.RiskCommand;
import riskmanagement.command.RiskControl;
import riskmanagement.command.RiskLikelihoodCommand;
import riskmanagement.command.RiskSeverityCommand;
import riskmanagement.model.Risk;

public class CreditRisk extends AbstractRisk{

	@Override
	public Risk calculateImpact() {
		// command pattern - credit risk has both severity and likelihood alone
		
		RiskControl control = new RiskControl();
		Risk risk = new Risk("2");
		RiskCommand severe = new RiskSeverityCommand(risk);
	    control.setCommand(severe);
	    control.applyrisk();
		RiskCommand likelihood = new RiskLikelihoodCommand(risk);
		control.setCommand(likelihood);
		control.applyrisk();	    
		return risk;
	}

}
