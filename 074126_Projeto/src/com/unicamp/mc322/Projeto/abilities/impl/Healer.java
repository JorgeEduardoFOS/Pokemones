package com.unicamp.mc322.Projeto.abilities.impl;

import com.unicamp.mc322.Projeto.Pokemon;
import com.unicamp.mc322.Projeto.Type;
import com.unicamp.mc322.Projeto.abilities.Abillity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Healer extends Abillity {

    public Healer(ArrayList<Pokemon> pokemons) {
        super("Healer", ACTIVE, new ArrayList<>(Arrays.asList(Type.PSYCHIC, Type.GRASS, Type.WATER)));
    }

    @Override
    public void executeAbility(Pokemon pokemon) {
        double newHitPoint;

        Random r = new Random();
        int randomChance = r.nextInt(10);

        if (randomChance < 7) { //70% de chance
            newHitPoint = pokemon.getHitPoints() * 1.1;
        } else if (randomChance < 9) { // 20% de chance
            newHitPoint = pokemon.getHitPoints() * 1.2;
        } else { // 1
            newHitPoint = pokemon.getHitPoints();
        }

        pokemon.setHitPoints(newHitPoint);
    }
}
