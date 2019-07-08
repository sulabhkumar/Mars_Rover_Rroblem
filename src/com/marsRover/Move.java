package com.marsRover;

public class Move implements FacingDirection {

	@Override
	public Input getNextFacingDirection(Input input) {
		String currentDirection = input.getCurrentFacingDir();
		if (currentDirection.equals("N"))
			currentDirection = "N";
		else if (currentDirection.equals("W"))
			currentDirection = "W";
		else if (currentDirection.equals("S"))
			currentDirection = "S";
		else if (currentDirection.equals("E"))
			currentDirection = "E";
		
		input.setCurrentFacingDir(currentDirection);
		return input;
	}

}
