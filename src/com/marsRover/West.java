package com.marsRover;

public class West implements Direction {

	@Override
	public Input getDirection(Input input) {
		input.setX(input.getX() - 1);
		return input;
	}

}
