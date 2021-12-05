package com.unicamp.mc322.Projeto.dices.impl;

import com.unicamp.mc322.Projeto.dices.Dice;

public class FourFaces extends Dice {
	public FourFaces() {
		super(4);
	}
	
	//////////////////////////
	//Área de testes
	//////////////////////////
	
	public static void main(String[] args) {
		FourFaces d1 = new FourFaces();
		for(int i = 0; i < 18; i++) {
			System.out.println(d1.rollDice());
		}
	}
}
