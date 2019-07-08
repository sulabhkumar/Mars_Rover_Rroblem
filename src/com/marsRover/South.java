package com.marsRover;

public class South implements Direction {

	@Override
	public Input getDirection(Input input) {
		input.setY(input.getY() - 1);
		return input;
	}

}
