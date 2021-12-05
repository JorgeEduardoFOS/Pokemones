package com.unicamp.mc322.Projeto.abilities.impl;

import com.unicamp.mc322.Projeto.Pokemon;
import com.unicamp.mc322.Projeto.Type;
import com.unicamp.mc322.Projeto.abilities.Abillity;

import java.util.ArrayList;
import java.util.Arrays;

public class Intimidate extends Abillity {

    public Intimidate() {
        super("Intimidate", PASSIVE, new ArrayList<>(Arrays.asList(Type.PSYCHIC, Type.FIRE, Type.DRAGON)));
    }

    @Override
    public void executeAbility(Pokemon pokemon) {
        pokemon.setDefensePoints(pokemon.getDefensePoints()*2); // se eu dobrar os pontos de defesa, o dano será 50% menor
    }
}
