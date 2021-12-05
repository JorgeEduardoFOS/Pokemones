package com.unicamp.mc322.Projeto;

import java.util.ArrayList;
import java.util.Scanner;
import com.unicamp.mc322.Projeto.abilities.Abillity;
import com.unicamp.mc322.Projeto.dices.impl.SixFaces;

public class Player {
	public final static int VALUE = 1;
	private static int playersCount, movements;
	private String name, icon;
	private SixFaces dice1 = new SixFaces();//, dice2 = new SixFaces();
	private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	private Pokemon chosenPokemon;
	private Position position;
	private Scanner input = new Scanner(System.in);
	private ArrayList<Abillity> inventory = new ArrayList<>();

	public Player() {
		name = "Player" + playersCount;
		++playersCount;
		position = new Position();
	}
	public Player(String name) {
		this.name = name;
		++playersCount;
		position = new Position();
		movements = 0;
	}
	public void setPlayerName(String name) {
		this.name = name;
	}
	public void setPlayerIcon(String icon) {
		this.icon = icon;
	}
	public void setPlayer() {
		System.out.println("Nome do jogador. Branco default.");
		String name = input.nextLine();
		setPlayerName(name);
		System.out.println("Defina um ícone de dois caracteres para seu herói. Branco default.");
		do {
			icon = input.nextLine();
			switch(icon) {
			case "  "://difícil de visualizar
				while (icon == "  ")
					icon = input.nextLine();
			case "--"://Ícone reservado para espaço vazio no mapa.
				while(icon == "--")
					icon = input.nextLine();
				break;
		}
			if (icon.length() != 2) {
				icon = "Pl";
				break;
			}
		} while(icon.length() != 2);
	}
	public String getPlayerName() {
		return name;
	}

	public String getIcon() {
		return icon;
	}

	public int rollDices() {
		return dice1.rollDice() + dice1.rollDice();
	}

	public int getNumberOfMovements() {
		return movements;
	}
	public void decreasesMovements() {
		--movements;
	}

	public void capture(Pokemon pokemon) {//É possível capturar um pokemon hostil?
		if (pokemon.getHostility() != Pokemon.HOSTILE) {
			if(position.getCurrentZ() == pokemon.getPosition().getCurrentZ()) {
				if(calcDistance(pokemon) <= pokemon.getMaxCaptureDistance()) {
					if((dice1.rollDice() + dice1.rollDice()) >=
						(pokemon.getCaptureDifficult() + pokemon.getMaxCaptureDistance())) {
						pokemons.add(pokemon);
					} else
						pokemon.increaseHostility();
				} else
					System.out.println("o pokemon está fora de alcance.");
			} else
				System.out.println("o pokemon está em outro plano.");
		} else
			System.out.println("para capturar um pokemon hostil, desmaie-o");
	}

	public void attack(Pokemon pokemon) {
		////////
	}

	public void choosePokemon(Pokemon pokemon) {
		chosenPokemon = pokemon;
	}

	public Pokemon getChosenPokemon() {
		return chosenPokemon;
	}

	private double calcDistance(Pokemon pokemon) {
		return Math.sqrt(Math.pow(getCurrentX() - pokemon.getPosition().getCurrentX(), 2)
				+ Math.pow(getCurrentY() - pokemon.getPosition().getCurrentY(), 2));
	}
	/*public int rollDices() {
		return dice1.rollDice() + dice2.rollDice();
	}*/
	
	public void moveUp() {
		position.moveUp();
	}
	public void moveDown() {
		position.moveDown();
	}
	public void moveLeft() {
		position.moveLeft();
	}
	public void moveRight() {
		position.moveRight();
	}
	public int getCurrentX() {
		return position.getCurrentX();
	}
	public int getCurrentY() {
		return position.getCurrentY();
	}
	public int getPreviousX() {
		return position.getPreviousX();
	}
	public int getPreviousY() {
		return position.getPreviousY();
	}

	public void updateInventory(){
		for (Abillity abillity : inventory){
			if (!abillity.isEnabled()) {
				if (abillity.getEffect() == Abillity.PASSIVE) {
					abillity.executeAbility(chosenPokemon);
				}
			}
		}
	}


	//////////////////////////
	//Área de testes
	//////////////////////////

	public static void main(String[] args) {
		/*Player p1 = new Player();
		/*Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player("Pierre");
		System.out.println(p4.getPlayerName());
		System.out.println(p3.getPlayerName());
		for(int i = 0; i < 30; i++) {
			System.out.println(p1.rollDices());
		}*/

	}
}
