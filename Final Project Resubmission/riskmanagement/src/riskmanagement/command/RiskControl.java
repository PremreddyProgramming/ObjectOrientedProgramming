package riskmanagement.command;

public class RiskControl {
	
	private RiskCommand command;

	public void setCommand(RiskCommand command) {
		this.command = command;
	}

	public void applyrisk() {
		command.execute();
	}
}