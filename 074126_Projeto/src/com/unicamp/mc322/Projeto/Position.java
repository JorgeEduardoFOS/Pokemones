package com.unicamp.mc322.Projeto;

public class Position {
	private int x, y, z;
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	public void moveUp() {
		--y;
	}
	public void moveDown() {
		++y;
	}
	public void moveLeft() {
		--x;
	}
	public void moveRight() {
		++x;
	}
}
