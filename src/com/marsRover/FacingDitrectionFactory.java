package com.marsRover;

public abstract class FacingDitrectionFactory {
	private static FacingDitrectionFactory instance;

	private FacingDitrectionFactory() {
	}

	public static FacingDitrectionFactory getInstance() {
		if (instance == null) {
			instance = new FacingDitrectionFactory() {
			};
		}

		return instance;
	}

	public FacingDirection getDirection(char currentInstruction) {
		if (currentInstruction == 'L') {
			return new Left();
		}

		if (currentInstruction == 'R') {
			return new Right();
		}
		
		return new Move();
	}
}
