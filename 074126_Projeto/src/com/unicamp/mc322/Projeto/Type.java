package com.unicamp.mc322.Projeto;

public enum Type {
    FIRE("Fire"),
    WATER("Water"),
    GRASS("Grass"),
    ELECTRIC("Electric"),
    PSYCHIC("Psychic"),
    DRAGON("Dragon");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
