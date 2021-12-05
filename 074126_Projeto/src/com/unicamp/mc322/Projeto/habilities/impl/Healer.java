package com.unicamp.mc322.Projeto.habilities.impl;

import com.unicamp.mc322.Projeto.Pokemon;
import com.unicamp.mc322.Projeto.Type;
import com.unicamp.mc322.Projeto.habilities.Abillity;

import java.util.ArrayList;

public class Healer extends Abillity {

    public Healer(ArrayList<Pokemon> pokemons) {
        super("Healer", ATIVE);
        defineSkillFullPokemons(pokemons);
    }

    @Override
    public void defineSkillFullPokemons(ArrayList<Pokemon> pokemons) {
        ArrayList<Pokemon> skillFullPokes = new ArrayList<>();
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getTypes().contains(Type.WATER) || pokemon.getTypes().contains(Type.GRASS) ||
                    pokemon.getTypes().contains(Type.PSYCHIC)) {
                skillFullPokes.add(pokemon);
            }
        }

        super.setSkillFullPokemons(skillFullPokes);
    }

    @Override
    public void executeAbility() {
        //TODO - create ability logic
    }
}
