package com.unicamp.mc322.Projeto;
import java.util.ArrayList;

public class Island {
	public final static String LIVRE = "--";
	public final static int VAZIO = 0;
	public final int MAX = 50;
	private Integer[][] matrix;
	private boolean visited;//a dificuldade de captura é configurada todas as vezes que entra na ilha ou só uma vez?
	private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	
	public Island() {
		int altura, largura;
		altura = largura = MAX;
		matrix = new Integer[altura][largura];
		for (int i = 0; i < altura; i++) {
			for ( int j = 0; j < largura; j++) {
				matrix[i][j]=0;
			}
		}		
	}

	public Island(int altura, int largura) {
		if(altura > MAX || largura > MAX) {
			System.out.println("A mair dimensão permitida é: " + MAX);
		}
		else {
			matrix = new Integer[altura][largura];
			for (int i = 0; i < altura; i++) {
				for ( int j = 0; j < largura; j++) {
					matrix[i][j]=0;
				}
			}
		}
	}
		
	public void removePokemon(Pokemon pokemon) {
		pokemons.remove(pokemon);
	}
	private void addPokemon(Pokemon pokemon) {
		pokemons.add(pokemon);
	}
	private void setPokemonsDistanceDifficult() {
		for(Pokemon pk: pokemons) {
			pk.setCaptureDifficult();
			pk.setMaxCaptureDistance();
		}
	}
	public void setVisited() {
		visited = true;
	}
	//Type enum?

}
