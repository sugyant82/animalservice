package com.singtel.animalservice.bean;


public class Dolphin implements Animal {
	
	private String type="ANIMAL";
	private String name="DOLPHIN";
	
	Fishes fish;
	
	public void hasFishProperties(Fishes fish)
	{
		this.fish =fish;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		System.out.println(this.fish.fly);
		return false;
	}
	
	@Override
	public boolean sing() {
		// TODO Auto-generated method stub
		System.out.println(this.fish.sing);
		return false;
	}

	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		System.out.println(this.fish.walk);
		return false;
	}

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		System.out.println(this.fish.swim);
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
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
	public boolean singInLanguage(String language) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getSing() {
		// TODO Auto-generated method stub
		return fish.getSing();
	}

	@Override
	public String getFly() {
		// TODO Auto-generated method stub
		return fish.getFly();
	}

	@Override
	public String getSwim() {
		// TODO Auto-generated method stub
		return fish.getSwim();
		
	}

	@Override
	public String getWalk() {
		// TODO Auto-generated method stub
		return fish.getWalk();
	}

	public String getType() {
		return type;
	}

}
