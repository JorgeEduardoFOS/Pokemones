package com.unicamp.mc322.Projeto.dices;

public abstract class Dice {
	protected int size;
	
	public Dice(int size) {
		this.size = size;
	}
	public int rollDice() {
		return (int)(size * Math.random() + 1);
	}

}
