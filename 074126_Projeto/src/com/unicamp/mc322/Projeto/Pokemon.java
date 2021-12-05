package com.unicamp.mc322.Projeto;

import com.unicamp.mc322.Projeto.abilities.Abillity;
import com.unicamp.mc322.Projeto.dices.impl.FourFaces;

import java.util.ArrayList;

public class Pokemon {
	public final boolean SIM = true, NAO = false;
	public static int CALM = 0, ANNOYED = 1, HOSTILE = 2;
	private int hostility;
	private boolean alert;
	private String name;
	private int attackPoints, defensePoints, maxCaptureDistance, captureDifficult;
	private double hitPoints, maxLife;
	private FourFaces dice1 = new FourFaces();//, dice2 = new FourFaces(), dice3 = new FourFaces();
	private Position position;
	private ArrayList<Type> types;

	public Pokemon(String name) {//types
		this.name = name;
		this.hitPoints = 100;
		maxLife = hitPoints;
	}
	public Pokemon(String name, int attackPoints) {
		this(name);
		this.attackPoints = attackPoints;
	}
	public Pokemon(String name, int attackPoints, int defensePoints) {
		this(name, attackPoints);
		this.defensePoints = defensePoints;
	}
	public Pokemon(String name, int attackPoints, int defensePoints, double hitPoints) {
		this(name, attackPoints, defensePoints);
		this.hitPoints = hitPoints;
	}
	public Pokemon(String name, int attackPoints, int defensePoints, Position position) {
		this(name, attackPoints, defensePoints);
		this.position = position;
	}
	public Pokemon(String name, int attackPoints, int defensePoints, Position position, ArrayList<Type> types) {
		this(name, attackPoints, defensePoints, position);
		this.types = types;
	}
	public String getName() {
		return name;
	}
	public double getMaxLife() {
		return maxLife;
	}
	public void setHitPoints(double hit) {
		hitPoints = hit;
	}
	public double getHitPoints() {
		return hitPoints;
	}
	public int getDefensePoints() {
		return defensePoints;
	}
	public void setDefensePoints(int defensePoints){
		this.defensePoints = defensePoints;
	}
	public int getAttackPoints() {
		return attackPoints;
	}
	public void setAttackPoints(int attackPoints){
		this.attackPoints = attackPoints;
	}
	public void setMaxCaptureDistance() { //public or private?
		maxCaptureDistance = this.dice1.rollDice();
	}
	public void setCaptureDifficult() { //public or private?
		captureDifficult = this.dice1.rollDice() + this.dice1.rollDice();
	}
	public int getMaxCaptureDistance() {
		return maxCaptureDistance;
	}
	public int getCaptureDifficult() {
		return captureDifficult;
	}
	public Position getPosition() {
		return position;
	}
	public void increaseHostility() {
		++hostility;
	}
	public int getHostility() {
		return hostility;
	}
	public void setAlertTrue() {
		alert = true;
	}
	public boolean getAlert() {
		return alert;
	}
	public void setTypes(ArrayList<Type> types) {
		this.types = types;
	}
	public ArrayList<Type> getTypes() {
		return types;
	}

	//Implementation
	public void attackBase(Pokemon pokemon) {
		///// sem efeito
		double damage;
		if((damage = pokemon.getHitPoints()  + pokemon.getDefensePoints() - pokemon.getAttackPoints()) <= 0)
			pokemon.setHitPoints(1);
		else
			pokemon.setHitPoints(damage);
	}
	public void attackHability(Pokemon pokemon, Abillity abillity) {
		abillity.executeAbility(this);
	}
	//////////////////////////
	//Área de testes
	//////////////////////////
	
	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon("Pikachu");
		System.out.println(pikachu.getMaxCaptureDistance());
		pikachu.setMaxCaptureDistance();
		System.out.println(pikachu.getMaxCaptureDistance());
		System.out.println(pikachu.getCaptureDifficult());
		pikachu.setCaptureDifficult();
		System.out.println(pikachu.getCaptureDifficult());
	}
}
