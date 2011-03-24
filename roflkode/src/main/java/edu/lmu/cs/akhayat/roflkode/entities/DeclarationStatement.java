package edu.lmu.cs.akhayat.roflkode.entities;

public class DeclarationStatement extends Statement {
    private Declarable declarable;

    /**
     * Creates a declaration statement.
     */
    public DeclarationStatement(Declarable declarable) {
        this.declarable = declarable;
    }

    /**
     * Returns the entity being declared.
     */
    public Declarable getDeclarable() {
        return declarable;
    }
}
