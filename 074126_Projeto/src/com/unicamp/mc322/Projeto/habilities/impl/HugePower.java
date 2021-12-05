package com.unicamp.mc322.Projeto.habilities.impl;

import com.unicamp.mc322.Projeto.Pokemon;
import com.unicamp.mc322.Projeto.Type;
import com.unicamp.mc322.Projeto.habilities.Abillity;

import java.util.ArrayList;

public class HugePower extends Abillity {

    public HugePower(ArrayList<Pokemon> pokemons){
        super("Huge Power", ATIVE);
        defineSkillFullPokemons(pokemons);
    }

    @Override
    public void defineSkillFullPokemons(ArrayList<Pokemon> pokemons) {
        super.setSkillFullPokemons(pokemons);
    }

    @Override
    public void executeAbility() {
        //TODO - create ability logic
    }
}
