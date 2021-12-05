package com.unicamp.mc322.Projeto;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Process;

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
		//while(!exitSelected && player1.getMovements() > 0) {
			//char command = input.next(".").charAt(0);
			String command = input2.nextLine();
			//System.out.println(command);
			command = command.toLowerCase();
			System.out.println(player1.getCurrentX() + " " + player1.getCurrentY() + " " + player1.getPreviousX() + " " + player1.getPreviousY());
			switch(command){
				case "quit":
				//case 'Q':
					exitSelected = true;
					break;
				case "w":
				//case 'W':
					if(player1.getCurrentY() > 0) {
						player1.moveUp();
						player1.decreasesMovements();
					}
					break;
				case "s":
				//case 'S':
					if(player1.getCurrentY() < ilha.getAltura()) {
						player1.moveDown();
						player1.decreasesMovements();
					}
					break;
				case "a":
				//case 'A':
					if(player1.getCurrentX() > 0) {
						player1.moveLeft();
						player1.decreasesMovements();
					}
					break;
				case "d":
				//case 'D':
					if(player1.getCurrentX() < ilha.getLargura()) {
						player1.moveRight();
						player1.decreasesMovements();
					}
					break;
				case "k":
				//case 'K':
					System.out.println("Teste");
					break;
				default:
					break;
			}
			System.out.println(player1.getCurrentX() + " " + player1.getCurrentY() + " " + player1.getPreviousX() + " " + player1.getPreviousY());
			ilha.movePlayer();
			//ilha.printIsland();
		//}
	}
	public void updateBoard() {
		
	}
	private void setPlayer() {
		player1 = new Player();
		player1.setPlayer();
	}
		
	//////
	//Teste
	/////
	public static void main(String[] args) {
		String comando = "echo paada";
		Game game = new Game();
		game.readInput();
		System.out.println("Acabou.");
		/*String cmd = "ls -al";
		Runtime run = Runtime.getRuntime();
		Process pr = run.exec(cmd);
		pr.waitFor();
		BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line = "";
		while ((line=buf.readLine())!=null) {
		System.out.println(line);
		}*/
	}
}
