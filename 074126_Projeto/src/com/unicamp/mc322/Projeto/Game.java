package com.unicamp.mc322.Projeto;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Process;

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
		char command = input.next(".").charAt(0);
		//input.
		//command = command.toLowerCase();
		switch(command){
			case 'q':
			case 'Q':
				exitSelected = true;
				break;
			case 'w':
			case 'W':
				//moveUp();
				break;
			case 's':
			case 'S':
				//moveDown();
				break;
			case 'a':
			case 'A':
				//moveLeft();
				break;
			case 'd':
			case 'D':
				//moveRight();
				break;
			case 'k':
			case 'K':
				System.out.println("Teste");
				break;
			default:
				break;
		}
	}
	public void updateBoard() {
		
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
		System.out.println(line);*/
		}
	}
}
