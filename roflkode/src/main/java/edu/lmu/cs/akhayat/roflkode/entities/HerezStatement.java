package edu.lmu.cs.akhayat.roflkode.entities;


/**
 * The HEREZ UR statement class.
 *
 */
public class HerezStatement extends Statement {

	private Expression expression;

	public HerezStatement(Expression expression) {
		this.expression = expression;
	}

	public Expression getExpression() {
		return expression;
	}
	
}
