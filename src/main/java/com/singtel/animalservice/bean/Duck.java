package com.singtel.animalservice.bean;

public class Duck extends Bird{

	private String type="BIRD";
	private String name="DUCK";
	
	private String sing = "Quack, quack";
	private String fly= "I can fly";
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
		return true;
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
