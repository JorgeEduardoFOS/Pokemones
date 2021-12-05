package com.unicamp.mc322.Projeto.habilities.impl;

import com.unicamp.mc322.Projeto.Pokemon;
import com.unicamp.mc322.Projeto.Type;
import com.unicamp.mc322.Projeto.habilities.Abillity;

import java.util.ArrayList;

public class FlameBody extends Abillity {

    public FlameBody(ArrayList<Pokemon> pokemons){
        super("Flame Body", PASSIVE);
        defineSkillFullPokemons(pokemons);
    }

    @Override
    public void defineSkillFullPokemons(ArrayList<Pokemon> pokemons) {
        ArrayList<Pokemon> skillFullPokes = new ArrayList<>();
        for (Pokemon pokemon : pokemons){
            if(pokemon.getTypes().contains(Type.DRAGON) || pokemon.getTypes().contains(Type.FIRE)){
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
