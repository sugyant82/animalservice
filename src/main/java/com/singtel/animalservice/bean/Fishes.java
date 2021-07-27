package com.singtel.animalservice.bean;

public interface Fishes extends Animal {
	
	String type="ANIMAL";
	String name="FISH";

	String sing = "I cannot Sing";
	String fly= "I cannot fly";
	String swim = "I can swim";
	String walk = "I cannot walk";

	String size = "I can Sing";
	String colour= "I can fly";
	String eat = "I cannot swim";
	String makeJokes = "I can walk";

	public void size() ;
	public void colour() ;
	public boolean eat();
	public boolean makeJokes();
	public boolean swim();





}
