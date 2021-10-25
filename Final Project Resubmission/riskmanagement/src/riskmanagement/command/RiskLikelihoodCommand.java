package riskmanagement.command;

import riskmanagement.model.Risk;

public class RiskLikelihoodCommand implements RiskCommand {

	
	private Risk risk;
	
	public RiskLikelihoodCommand(Risk risk) {
		this.risk = risk;
	}

	@Override
	public void execute() {
		risk.setRiskScore(risk.getRiskScore()+20);
		
	}

}
