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
			System.out.println("Escolha uma ação. (1)rollDice, (2)Escolher Pokemon, (3)Usar Item do inventário),"
					+ "(4)Atacar um pokemon, (5)Tentar capturar pokemon");
			int command;
			try {
				command = input2.nextInt();
			}
			catch(java.util.InputMismatchException e) {
				command = 1;
			}
			finally{
				command = 1;
			}
			switch(command) {
			case 1:
				player1.rollDices();
				break;
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Não foi implementado. Ação será rollDice.");
			default:
				player1.rollDices();
				break;			
			}
		}
		else {
			String command = input2.nextLine();
			command = command.toLowerCase();
			System.out.println("Utilize as teclas wasd para caminhar e quit para sair.");
			switch(command){
				case "quit":
					exitSelected = true;
					player1.setMovementToZero();
					break;
				case "w":
					if(player1.getCurrentY() > 0) {
						player1.moveUp();
					}
					break;
				case "s":
					if(player1.getCurrentY() < ilha.getAltura()) {
						player1.moveDown();
					}
					break;
				case "a":
					if(player1.getCurrentX() > 0) {
						player1.moveLeft();
					}
					break;
				case "d":
					if(player1.getCurrentX() < ilha.getLargura()) {
						player1.moveRight();
					}
					break;
				case "k":
					System.out.println("Teste");
					break;
				default:
					break;
			}
			System.out.println(player1.getNumberOfMovements() + " movimentos restantes.");
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
