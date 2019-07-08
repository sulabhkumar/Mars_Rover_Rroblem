package com.marsRover;

public class North implements Direction {

	@Override
	public Input getDirection(Input input) {
		input.setY(input.getY() + 1);
		return input;
	}
	
}
