package com.unicamp.mc322.Projeto.dices.impl;

import com.unicamp.mc322.Projeto.dices.Dice;

public class SixFaces extends Dice {
	public SixFaces() {
		super(6);
	}
	//////////////////////////
	//Área de testes
	//////////////////////////
	
	public static void main(String[] args) {
		SixFaces d1 = new SixFaces();
		for(int i = 0; i < 18; i++) {
			System.out.println(d1.rollDice());
		}
	}
}
