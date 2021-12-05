package com.unicamp.mc322.Projeto;
import java.util.ArrayList;

public class Island {
	public final static String LIVRE = "--";
	public final static int VAZIO = 0;
	public final int DEFAULT = 20, MAX = 30;
	private Integer[][] matrix;
	private int altura, largura;
	private boolean visited;//a dificuldade de captura é configurada todas as vezes que entra na ilha ou só uma vez?
	private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	private Player player;
	private Type type;
	
	public Island() {
		altura = largura = DEFAULT;
		matrix = new Integer[altura][largura];
		for (int i = 0; i < altura; i++) {
			for ( int j = 0; j < largura; j++) {
				matrix[i][j] = VAZIO;
			}
		}		
	}
	
	public Island(Player player) {
		altura = largura = DEFAULT;
		matrix = new Integer[altura][largura];
		for (int i = 0; i < altura; i++) {
			for ( int j = 0; j < largura; j++) {
				matrix[i][j] = VAZIO;
			}
		}
		this.player = player;
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
					matrix[i][j] = VAZIO;
				}
			}
		}
	}
	public int getLargura() {
		return largura;
	}
	public int getAltura() {
		return altura;
	}

	public Island(Type type){
		this.type = type;
	}

	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	// Implementation
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
	
	public void movePlayer() {
		if(player.getCurrentY() >= largura || player.getCurrentX() >= altura)
			System.out.println("Fora de campo");
		else
			matrix[player.getPreviousY()][player.getPreviousX()] = Island.VAZIO;
			matrix[player.getCurrentY()][player.getCurrentX()] = Player.VALUE;
	}
	public void printIsland() {
		for(int i = 0; i < altura; i++) {
			for(int j = 0; j < largura; j++) {
				switch (this.matrix[i][j]) {
				case Island.VAZIO:
					System.out.print(' ' + LIVRE + ' ');
					break;
				case Player.VALUE:
					System.out.print(' ' + player.getIcon() + ' ');
					break;
				}	
			}
			System.out.println();
		}
			
	}
	public void setVisited() {
		visited = true;
	}
	
	
	//Type enum?
	
	//////////////
	//Testes
	//////////////
	public static void main(String[] args) {
		Island fantasy = new Island();
		fantasy.printIsland();
	}
}
