package com.unicamp.mc322.Projeto;

public class Position {
	private int currentX, currentY, currentZ, previousX, previousY, previousZ;
	Position(){
		currentX = currentY = currentZ = 0;
	}
	Position(int x, int y){
		this.currentX = x;
		this.currentY = y;
	}
	public void setX(int x) {
		this.currentX = x;
	}
	public void setY(int y) {
		this.currentY = y;
	}
	public void setZ(int z) {
		this.currentZ = z;
	}
	public int getCurrentX() {
		return currentX;
	}
	public int getCurrentY() {
		return currentY;
	}
	public int getCurrentZ() {
		return currentZ;
	}
	public int getPreviousX() {
		return previousX;
	}
	public int getPreviousY() {
		return previousY;
	}
	public int getPreviusZ() {
		return previousZ;
	}
	public void moveUp() {
		previousX = currentX;
		previousY = currentY;
		--currentY;
	}
	public void moveDown() {
		previousX = currentX;
		previousY = currentY;
		++currentY;
	}
	public void moveLeft() {
		previousX = currentX;
		previousY = currentY;
		--currentX;
	}
	public void moveRight() {
		previousX = currentX;
		previousY = currentY;
		++currentX;
	}
}
