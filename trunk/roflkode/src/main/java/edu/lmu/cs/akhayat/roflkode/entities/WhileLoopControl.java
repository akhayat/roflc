package edu.lmu.cs.akhayat.roflkode.entities;

public class WhileLoopControl extends LoopControlExpression {
	
    private Expression singleExpression;
    
    public WhileLoopControl(Expression singleExpression) {
        this.singleExpression = singleExpression;
    }

}
