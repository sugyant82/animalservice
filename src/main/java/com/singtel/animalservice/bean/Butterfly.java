package com.singtel.animalservice.bean;

public class Butterfly implements Animal{

	private String type="ANIMAL";
	private String name="BUTTERFLY";
	
	private String sing = "I cannot sing";
	private String fly= "I can fly";
	private String swim = "I cannot swim";
	private String walk = "I cannot walk";
	
	boolean isAcaterpiller= false;
	

	public boolean isCaterpiller() {
		return isAcaterpiller;
	}

	@Override
	public void setMorph(String morphType) {
		
		if(morphType.equalsIgnoreCase("caterpillar")) {
		
		this.isAcaterpiller = true;
		this.fly="I cannot fly";
		this.walk="I can walk";
		this.name="CATERPILLAR";
		}
	}


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

	@Override
	public boolean sing() {
		System.out.println(sing);
		return false;
		
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
	public boolean swim() {
		System.out.println(swim);
		return false;
	}


	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		System.out.println(fly);
		
		if(this.isAcaterpiller) {
			
			return false;

		}
		return true;
	}


	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		System.out.println(walk);
		
		if(this.isAcaterpiller) {
			
			return true;

		}
		return false;
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

	


	

}
