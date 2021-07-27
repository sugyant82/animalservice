package com.singtel.animalservice.bean;

public interface Animal {
	
	String type="ANIMAL";
	String name="ANIMAL";
	
	String sing = "I can Sing";
	String fly = "I can Fly";
	String swim = "I can Swim";
	String walk = "I can Walk";
	
	
	
	public boolean fly();
	public boolean sing();
	public boolean walk();
	public boolean swim();
	
	public String getName();
	
	public void setMorph(String morphType);
	public void livingWith(String animal);
	public boolean singInLanguage(String language) ;
	
	public String getSing();
	public String getFly();
	public String getSwim();
	public String getWalk();
	

}
