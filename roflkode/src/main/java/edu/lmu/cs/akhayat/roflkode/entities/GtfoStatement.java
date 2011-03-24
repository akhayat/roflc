package edu.lmu.cs.akhayat.roflkode.entities;

public class GtfoStatement extends Statement {

	private VariableExpression loopName;

	public GtfoStatement() {
	}
	
	public GtfoStatement(VariableExpression loopName) {
		this.loopName = loopName;
	}

	public VariableExpression getLoop() {
		return loopName;
	}
	
	
	
}
