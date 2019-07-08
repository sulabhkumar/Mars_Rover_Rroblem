package com.marsRover;

public class DirectionFactory {

	private static DirectionFactory instance;

	private DirectionFactory() {
	}

	public static DirectionFactory getInstance() {
		if (instance == null) {
			instance = new DirectionFactory();
		}

		return instance;
	}

	public Direction getDirection(String string) {
		Direction direction = null;
		switch (string) {
		case "S":
			direction = new South();
			break;
		case "W":
			direction = new West();
			break;
		case "E":
			direction = new East();
			break;
		case "N":
			direction = new North();
		}
		
		return direction;
	}

}
