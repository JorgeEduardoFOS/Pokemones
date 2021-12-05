package com.unicamp.mc322.Projeto;
import com.unicamp.mc322.Projeto.dices.impl.SixFaces;

import java.util.ArrayList;

public class Player {
	private static int playersCount;
	private String name;
	private SixFaces dice1 = new SixFaces();//, dice2 = new SixFaces();
	private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	private Pokemon chosenPokemon;
	private Position position;
	
	public Player() {
		name = "Player" + playersCount;
		++playersCount;
	}
	public Player(String name) {
		this.name = name;
		++playersCount;
	}
	public String getPlayerName() {
		return name;
	}

	public int rollDices() {
		return dice1.rollDice() + dice1.rollDice();
	}

	public void capture(Pokemon pokemon) {//É possível capturar um pokemon hostil?
		if (pokemon.getHostility() != Pokemon.HOSTILE) {
			if (position.getZ() == pokemon.getPosition().getZ()) {
				if (calcDistance(pokemon) <= pokemon.getMaxCaptureDistance()) {
					if ((dice1.rollDice() + dice1.rollDice()) >=
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
		return Math.sqrt(Math.pow(position.getX() - pokemon.getPosition().getX(), 2)
				+ Math.pow(position.getY() - pokemon.getPosition().getY(), 2));
	}
	/*public int rollDices() {
		return dice1.rollDice() + dice2.rollDice();
	}*/
	
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