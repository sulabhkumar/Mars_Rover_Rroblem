package com.marsRover;

public class Input {
	private int x;
	private int y;
	private String currentFacingDir;

	public Input(int x, int y, String currentFacingDir) {
		super();
		this.x = x;
		this.y = y;
		this.currentFacingDir = currentFacingDir;
	}
	
	

	@Override
	public String toString() {
		return x + " " + y + " " + currentFacingDir;
 	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getCurrentFacingDir() {
		return currentFacingDir;
	}

	public void setCurrentFacingDir(String currentFacingDir) {
		this.currentFacingDir = currentFacingDir;
	}

}