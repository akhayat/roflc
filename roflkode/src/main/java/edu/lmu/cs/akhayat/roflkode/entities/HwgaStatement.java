package edu.lmu.cs.akhayat.roflkode.entities;

public class HwgaStatement extends Statement {

	private String loopName;
	
	public HwgaStatement() {
	}

	public HwgaStatement(String loopName) {
		this.loopName = loopName;
	}

	public String getLoopName() {
		return loopName;
	}
	
}
