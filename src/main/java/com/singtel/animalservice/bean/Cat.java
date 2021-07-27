package com.singtel.animalservice.bean;

public class Cat extends Bird{

	private String type="ANIMAL";
	private String name="CAT";
	
	private String sing = "Meow";
	private String fly= "I cannot fly";
	private String swim = "I can swim";
	private String walk = "I can walk";


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

	public String getSing() {
		return sing;
	}


	public void setSing(String sing) {
		this.sing = sing;
	}


	public String getFly() {
		return fly;
	}


	public void setFly(String fly) {
		this.fly = fly;
	}


	public String getSwim() {
		return swim;
	}


	public void setSwim(String swim) {
		this.swim = swim;
	}


	public String getWalk() {
		return walk;
	}


	public void setWalk(String walk) {
		this.walk = walk;
	}


	
	@Override
	public boolean sing() {

		System.out.println(sing);
		return true;
	}
	
	@Override
	public boolean fly() {
		System.out.println(fly);
		return false;
	}
	
	@Override
	public boolean walk() {
		System.out.println(walk);
		return true;
	}
	
	@Override
	public boolean swim() {
		System.out.println(swim);
		return true;
	}


	

}
