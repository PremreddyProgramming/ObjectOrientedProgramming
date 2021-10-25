package riskmanagement.command;

import riskmanagement.model.Risk;

public class RiskSeverityCommand implements RiskCommand {
	
	private Risk risk;

	public RiskSeverityCommand(Risk risk) {
		this.risk = risk;
	}

	@Override
	public void execute() {
		risk.setRiskScore(risk.getRiskScore()+10);
		
	}

}
