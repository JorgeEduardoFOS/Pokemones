package com.unicamp.mc322.Projeto;

public abstract class Dice {
	protected int size;
	
	public Dice(int size) {
		this.size = size;
	}
	protected int rollDice() {
		return (int)(size * Math.random() + 1);
	}

}
