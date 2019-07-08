package com.marsRover;

public class Left implements FacingDirection {
	
	@Override
	public Input getNextFacingDirection(Input input) {

		String currentDirection = input.getCurrentFacingDir();
		if(currentDirection.equals("N"))
			currentDirection = "W";
		else if(currentDirection.equals("W"))
			currentDirection =  "S";
		else if(currentDirection.equals("S"))
			currentDirection = "E";
		else if(currentDirection.equals("E"))
			currentDirection = "N";
	
		input.setCurrentFacingDir(currentDirection);
		return input;
	}
	
}