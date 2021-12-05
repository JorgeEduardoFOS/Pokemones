package com.unicamp.mc322.Projeto;
import java.util.ArrayList;

public class Island {
	private boolean visited; //a dificuldade de captura é configurada todas as vezes que entra na ilha ou só uma vez?
	private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	private Type type;

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
}
