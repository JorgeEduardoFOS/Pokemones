package com.unicamp.mc322.Projeto;

public class Pokemon {
	public final boolean SIM = true, NAO = false;
	public final int CALM = 0, ANNOYED = 1, HOSTILE = 2;
	private int hostility;
	private boolean alert;
	private String name;
	private int hitPoints, attackPoints, defensePoints, maxCaptureDistance, captureDifficult;
	private FourFaces dice1 = new FourFaces();//, dice2 = new FourFaces(), dice3 = new FourFaces();
	private Position position;
	//type1 enum?
	//type2 enum?
	
	public Pokemon(String name) {//types
		this.name = name;
	}
	public Pokemon(String name, int attackPoints) {
		this(name);
		this.attackPoints = attackPoints;
	}
	public Pokemon(String name, int attackPoints, int defensePoints) {
		this(name, attackPoints);
		this.defensePoints = defensePoints;
	}
	public Pokemon(String name, int attackPoints, int defensePoints, Position position) {
		this(name, attackPoints, defensePoints);
		this.position = position;
	}
	public String getName() {
		return name;
	}
	private void setHitPoints(int hit) {
		hitPoints = hit;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public int getDefensePoints() {
		return defensePoints;
	}
	public int getAttackPoints() {
		return attackPoints;
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
	public void attackBase(Pokemon pokemon) {
		///// sem efeito
		int damage;
		if((damage = pokemon.getHitPoints()  + pokemon.getDefensePoints() - pokemon.getAttackPoints()) <= 0)
			pokemon.setHitPoints(1);
		else
			pokemon.setHitPoints(damage);
	}
	public void attackHability(Pokemon pokemon) {
		//////
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
