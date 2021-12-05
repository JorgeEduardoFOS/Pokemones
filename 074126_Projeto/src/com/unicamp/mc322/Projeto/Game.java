package com.unicamp.mc322.Projeto;
import java.util.Scanner;

public class Game {
	private boolean exitSelected;
	private Scanner input2 = new Scanner(System.in);
	Island ilha;
	Player player1;
	
	public void start() {
		exitSelected = false;
		setPlayer();
		ilha = new Island(player1);
		System.out.println("Game started!");
		ilha.movePlayer();
		while(!exitSelected) {
			drawBoard();
			readInput();
			updateBoard();
		}
		System.out.println("Game termineted. Bye!");
	}
	public void drawBoard() {
		ilha.printIsland();
	}
	public void readInput() {
		if(player1.getNumberOfMovements() < 1) {
			player1.rollDices();
			readInput();
		}
		else {
			String command = input2.nextLine();
			command = command.toLowerCase();
			switch(command){
				case "quit":
					exitSelected = true;
					break;
				case "w":
					if(player1.getCurrentY() > 0) {
						player1.moveUp();
						player1.decreasesMovements();
					}
					break;
				case "s":
					if(player1.getCurrentY() < ilha.getAltura()) {
						player1.moveDown();
						player1.decreasesMovements();
					}
					break;
				case "a":
					if(player1.getCurrentX() > 0) {
						player1.moveLeft();
						player1.decreasesMovements();
					}
					break;
				case "d":
					if(player1.getCurrentX() < ilha.getLargura()) {
						player1.moveRight();
						player1.decreasesMovements();
					}
					break;
				case "k":
					System.out.println("Teste");
					break;
				default:
					break;
			}
		}			
	}
	public void updateBoard() {
		ilha.movePlayer();
	}
	private void setPlayer() {
		player1 = new Player();
		player1.setPlayer();
	}
		
	//////
	//Teste
	/////
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
		System.out.println("Acabou.");
	}
}
