package com.unicamp.mc322.Projeto;
import java.util.ArrayList;

public class Island {
	public final static String LIVRE = "--";
	public final static int VAZIO = 0;
	public final int MAX = 50;
	private Integer[][] matrix;
	private int altura, largura;
	private boolean visited;//a dificuldade de captura é configurada todas as vezes que entra na ilha ou só uma vez?
	private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	
	public Island() {
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
			this.altura = altura;
			this.largura = largura;
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
	public void printIsland() {
		for(int i = 0; i < altura; i++) {
			for(int j = 0; j < largura; j++) {
				switch (this.matrix[i][j]) {
				case Island.VAZIO:
					System.out.print(' ' + Island.LIVRE + ' ');
					break;
				/*case Stone.VALUE:
					System.out.print(' ' + Stone.ICONE + ' ');
					break;
				case Predator.VALUE:
					System.out.print(' ' + Predator.ICONE + ' ');
					break;
				case Traps.VALUE:
					System.out.print(' ' + Traps.ICONE + ' ');
					break;
				case Vagalumes.SATISFACTION:
					System.out.print(' ' + Vagalumes.ICONE + ' ');
					break;
				case Grilos.SATISFACTION:
					System.out.print(' ' + Grilos.ICONE + ' ');
					break;
				case Frog.VALUE:
					System.out.print(' ' + player.getIcone() + ' ');
					break;*/
				}	
			}
			System.out.println();
		}
			
	}
	
	//Type enum?
	
	//////////////
	//Testes
	//////////////
	public static void main(String[] args) {
		
	}

}
