package com.unicamp.mc322.Projeto.habilities;

import com.unicamp.mc322.Projeto.Pokemon;

import java.util.ArrayList;

public abstract class Abillity implements AbilityAction{
    public static int PASSIVE = 0, ATIVE = 1;

    private final String name;
    private ArrayList<Pokemon> skillFullPokemons;
    private int effect;

    public Abillity(String name) {
        this.name = name;
    }

    public Abillity(String name, int effect) {
        this(name);
        this.effect = effect;
    }

    public Abillity(String name, int effect, ArrayList<Pokemon> skillFullPokemons) {
        this(name, effect);
        this.skillFullPokemons = skillFullPokemons;
    }

    public String getName() {
        return name;
    }

    public int getEffect() {
        return this.effect;
    }

    public ArrayList<Pokemon> getSkillFullPokemons() {
        return skillFullPokemons;
    }

    public void setSkillFullPokemons(ArrayList<Pokemon> skillFullPokemons) {
        this.skillFullPokemons = skillFullPokemons;
    }
}
