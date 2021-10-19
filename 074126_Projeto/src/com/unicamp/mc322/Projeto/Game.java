package com.unicamp.mc322.Projeto;

public class Game {
	private boolean exitSelected;
	
	public void start() {
		exitSelected = false;
		System.out.println("Game started!");
		while(!exitSelected) {
			drawBoard();
			readInput();
			updateBoard();
		}
		System.out.println("Game termineted. Bye!");
	}
	public void drawBoard() {
		
	}
	public void readInput() {
		///////Scanner
	}
	public void updateBoard() {
		
	}
}
