package com.unicamp.mc322.Projeto.habilities.impl;

import com.unicamp.mc322.Projeto.Pokemon;
import com.unicamp.mc322.Projeto.Type;
import com.unicamp.mc322.Projeto.habilities.Abillity;

import java.util.ArrayList;

public class Berserk extends Abillity {

    public Berserk(ArrayList<Pokemon> pokemons){
        super("Berserk", PASSIVE);
        defineSkillFullPokemons(pokemons);
    }

    @Override
    public void defineSkillFullPokemons(ArrayList<Pokemon> pokemons) {
        ArrayList<Pokemon> skillFullPokes = new ArrayList<>();
        for (Pokemon pokemon : pokemons){
            if(pokemon.getTypes().contains(Type.DRAGON) || pokemon.getTypes().contains(Type.ELECTRIC)){
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
