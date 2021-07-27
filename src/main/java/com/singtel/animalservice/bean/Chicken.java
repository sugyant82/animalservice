package com.singtel.animalservice.bean;

public class Chicken extends Bird{

	private String type="BIRD";
	private String name="CHICKEN";
	
	private String sing = "Cluck, cluck";
	protected String fly= "I cannot fly";

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
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
		return super.swim;
	}

	public void setSwim(String swim) {
		super.swim = swim;
	}

	public String getWalk() {
		return super.walk;
	}

	public void setWalk(String walk) {
		super.walk = walk;
	}

	@Override
	public boolean fly() {
		System.out.println(fly);
		return false;
	}

	@Override
	public boolean sing() {

		System.out.println(sing);
		return true;
	}

	

}
