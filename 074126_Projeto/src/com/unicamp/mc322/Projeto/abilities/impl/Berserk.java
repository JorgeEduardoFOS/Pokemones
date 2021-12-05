package com.unicamp.mc322.Projeto.abilities.impl;

import com.unicamp.mc322.Projeto.Pokemon;
import com.unicamp.mc322.Projeto.Type;
import com.unicamp.mc322.Projeto.abilities.Abillity;

import java.util.ArrayList;
import java.util.Arrays;

public class Berserk extends Abillity {

    public Berserk(){
        super("Berserk", PASSIVE, new ArrayList<>(Arrays.asList(Type.ELECTRIC, Type.DRAGON)));
    }

    @Override
    public void executeAbility(Pokemon pokemon) {
        if (pokemon.getHitPoints() <= (pokemon.getMaxLife()/2))
            pokemon.setAttackPoints(pokemon.getAttackPoints()*2);
    }
}
