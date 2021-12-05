package com.unicamp.mc322.Projeto;
import java.util.Scanner;

public class Game {
	private boolean exitSelected;
	private Scanner input = new Scanner(System.in);
	
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
		String command = input.nextLine();
		command = command.toLowerCase();
		switch(command){
			case "quit":
				exitSelected = true;
				break;
			case "w":
				//moveUp();
				break;
			case "s":
				//moveDown();
				break;
			case "a":
				//moveLeft();
				break;
			case "d":
				//moveRight();
				break;
		}
	}
	public void updateBoard() {
		
	}
}
