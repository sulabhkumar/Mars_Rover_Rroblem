package com.marsRover;

public class Right implements FacingDirection {
	
	@Override
	public Input getNextFacingDirection(Input input) {
		String currentDirection = input.getCurrentFacingDir();
		if(currentDirection.equals("N"))
			currentDirection =  "E";
		else if(currentDirection.equals("W"))
			currentDirection =  "N";
		else if(currentDirection.equals("S"))
			currentDirection = "W";
		else if(currentDirection.equals("E"))
			currentDirection = "S";
		
		input.setCurrentFacingDir(currentDirection);
		return input;
	}

}
