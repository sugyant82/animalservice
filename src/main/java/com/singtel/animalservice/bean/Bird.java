package com.singtel.animalservice.bean;

public class Bird implements Animal {

	protected String type="ANIMAL";
	protected String name="BIRD";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String sing = "I can Sing";
	protected String fly= "I can fly";
	protected String swim = "I cannot swim";
	protected String walk = "I can walk";

	@Override
	public boolean sing() {

		System.out.println(sing);
		return true;
	}

	public String getSing() {
		return sing;
	}

	public void setSing(String sing) {
		this.sing = sing;
	}

	@Override
	public boolean fly() {
		System.out.println(fly);
		return true;
	}

	@Override
	public boolean swim() {
		System.out.println(swim);
		return false;
	}

	@Override
	public boolean walk() {

		System.out.println(walk);
		return true;

	}

	@Override
	public void setMorph(String morphType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void livingWith(String animal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getFly() {
		// TODO Auto-generated method stub
		return fly;
	}

	@Override
	public String getSwim() {
		// TODO Auto-generated method stub
		return swim;
	}

	@Override
	public String getWalk() {
		// TODO Auto-generated method stub
		return walk;
	}

	@Override
	public boolean singInLanguage(String language) {
		// TODO Auto-generated method stub
		return false;
	}


}
