package edu.lmu.cs.akhayat.roflkode.entities;

/**
 * A Roflkode BRB statement.
 */
public class BrbStatement extends Statement {

    private Expression expression;

    public BrbStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}

