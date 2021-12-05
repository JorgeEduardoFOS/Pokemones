package com.unicamp.mc322.Projeto.abilities.impl;

import com.unicamp.mc322.Projeto.Pokemon;
import com.unicamp.mc322.Projeto.Type;
import com.unicamp.mc322.Projeto.abilities.Abillity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FlameBody extends Abillity {

    public FlameBody(){
        super("Flame Body", PASSIVE, new ArrayList<>(Arrays.asList(Type.FIRE, Type.DRAGON)));
    }

    @Override
    public void executeAbility(Pokemon pokemon) {
        // TODO
    }
}
