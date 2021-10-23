package riskmanagement.risktype;

import riskmanagement.command.RiskCommand;
import riskmanagement.command.RiskControl;
import riskmanagement.command.RiskSeverityCommand;
import riskmanagement.model.Risk;

public class MarketRisk extends AbstractRisk {

	@Override
	public Risk calculateImpact() {
		
		// command pattern - market risk has severity alone
		
		RiskControl control = new RiskControl();
	    Risk risk = new Risk("3");
	    RiskCommand severe = new RiskSeverityCommand(risk);
	    control.setCommand(severe);
	    control.applyrisk();
	    return risk;
	}

}
