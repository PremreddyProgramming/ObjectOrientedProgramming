package riskmanagement.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import riskmanagement.model.Risk;

public class RiskCommandTest {

	@org.junit.jupiter.api.Test
	public void testRiskCommandPatternCase_onecommand() {

		RiskControl control = new RiskControl();
		Risk risk = new Risk("1");
		RiskCommand likelihood = new RiskLikelihoodCommand(risk);
		control.setCommand(likelihood);
		control.applyrisk();
		assertEquals(risk.getRiskId(), "1");
		assertEquals(risk.getRiskScore(), 20);
	}
	
	
	@org.junit.jupiter.api.Test
	public void testRiskCommandPatternCase_twocommands() {

		RiskControl control = new RiskControl();
		Risk risk = new Risk("2");
		RiskCommand severe = new RiskSeverityCommand(risk);
	    control.setCommand(severe);
	    control.applyrisk();
		RiskCommand likelihood = new RiskLikelihoodCommand(risk);
		control.setCommand(likelihood);
		control.applyrisk();
		assertEquals(risk.getRiskId(), "2");
		assertEquals(risk.getRiskScore(), 30);
	}
	
	@org.junit.jupiter.api.Test
	public void testRiskCommandPatternCase_NoCommands() {

		RiskControl control = new RiskControl();
		Risk risk = new Risk("2");
		RiskCommand severe = new RiskSeverityCommand(risk);
		RiskCommand likelihood = new RiskLikelihoodCommand(risk);
		assertEquals(risk.getRiskId(), "2");
		assertEquals(risk.getRiskScore(), 0);
	}

}
