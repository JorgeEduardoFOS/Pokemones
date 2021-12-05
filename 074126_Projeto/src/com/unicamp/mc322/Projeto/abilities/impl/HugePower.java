package com.unicamp.mc322.Projeto.abilities.impl;

import com.unicamp.mc322.Projeto.Pokemon;
import com.unicamp.mc322.Projeto.abilities.Abillity;

import java.util.ArrayList;

public class HugePower extends Abillity {

    public HugePower(){
        super("Huge Power", ACTIVE);
    }

    @Override
    public void executeAbility(Pokemon pokemon) {
        pokemon.setAttackPoints(pokemon.getAttackPoints() * 2);
        pokemon.setDefensePoints(pokemon.getDefensePoints() * 2);
        pokemon.setHitPoints(pokemon.getHitPoints() - 5.0);
    }
}
