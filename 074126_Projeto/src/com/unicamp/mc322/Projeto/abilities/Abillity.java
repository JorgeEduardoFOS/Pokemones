package com.unicamp.mc322.Projeto.abilities;

import com.unicamp.mc322.Projeto.Pokemon;
import com.unicamp.mc322.Projeto.Type;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Abillity implements AbilityAction {
    public static int PASSIVE = 0, ACTIVE = 1;

    private final String name;
    private ArrayList<Type> skillfullTypes;
    private int effect;
    private boolean enabled = false;

    public Abillity(String name) {
        this.name = name;
    }

    public Abillity(String name, int effect) {
        this(name);
        this.effect = effect;
        this.setSkillfullTypes(
                new ArrayList<>(
                        Arrays.asList(
                                Type.DRAGON,
                                Type.FIRE,
                                Type.PSYCHIC,
                                Type.ELECTRIC,
                                Type.GRASS,
                                Type.WATER
                        )
                )
        );
    }

    public Abillity(String name, int effect, ArrayList<Type> skillfullTypes) {
        this(name, effect);
        this.skillfullTypes = skillfullTypes;
    }

    public String getName() {
        return name;
    }

    public int getEffect() {
        return this.effect;
    }

    public ArrayList<Type> getSkillfullTypes() {
        return skillfullTypes;
    }

    public void setSkillfullTypes(ArrayList<Type> skillfullTypes) {
        this.skillfullTypes = skillfullTypes;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void enableSkill() {
        this.enabled = true;
    }
}
