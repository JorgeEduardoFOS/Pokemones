package com.unicamp.mc322.Projeto;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	private static int playersCount;
	private String name, icon;
	private SixFaces dice1 = new SixFaces();//, dice2 = new SixFaces();
	private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	private Pokemon chosenPokemon;
	private Position position;
	private Scanner input = new Scanner(System.in);
	
	public Player() {
		name = "Player" + playersCount;
		++playersCount;
	}
	public Player(String name) {
		this.name = name;
		++playersCount;
	}
	public void setPlayerName(String name) {
		this.name = name;
	}
	public void setPlayerIcon(String icon) {
		this.icon = icon;
	}
	public void setPlayer() {
		System.out.println("Nome do jogador");
		String name = input.nextLine();
		setPlayerName(name);
		System.out.println("Defina um ícone de dois caracteres para seu herói.");
		while(icon.length() != 2) {
			icon = input.nextLine();
			switch(icon) {
				case "  "://difícil de visualizar
				case "--"://Ícone reservado para espaço vazio no mapa.
					icon = input.nextLine();
					break;
			}
		}
	}
	public String getPlayerName() {
		return name;
	}
	public int rollDices() {
		return dice1.rollDice() + dice1.rollDice();
	}
	public void capture(Pokemon pokemon) {//É possível capturar um pokemon hostil?
		if(position.getZ() == pokemon.getPosition().getZ()) {
			if(calcDistance(pokemon) <= pokemon.getMaxCaptureDistance()) {
				if((dice1.rollDice() + dice1.rollDice()) >= 
						(pokemon.getCaptureDifficult() + pokemon.getMaxCaptureDistance())) {
					pokemons.add(pokemon);
				}
				else
					pokemon.increaseHostility();
			}
			else
				System.out.println("o pokemon está fora de alcace.");
		}
		else
			System.out.println("o pokemon está em outro plano.");
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
