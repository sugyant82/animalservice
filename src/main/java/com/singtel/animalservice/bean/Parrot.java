package com.singtel.animalservice.bean;


public class Parrot extends Bird{

	private String type="BIRD";
	private String name="PARROT";
	
	private String sing = "I can sing";
	
	Animal livingWithAnimal = null ;
	
	@Override
	public void livingWith(String animal)
	{
		if(animal.equalsIgnoreCase("dog")) {
			livingWithAnimal= new Dog();
		}
		
		else if(animal.equalsIgnoreCase("cat")) {
			livingWithAnimal= new Cat();
		}
		else if(animal.equalsIgnoreCase("rooster")) {
			livingWithAnimal= new Rooster();
		}
		else {
			livingWithAnimal= new Duck();
		}
		
		this.setSing(livingWithAnimal.getSing());

	}

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
		return super.fly;
	}

	public void setFly(String fly) {
		super.fly = fly;
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
		return true;
	}

	@Override
	public boolean sing() {

		System.out.println(sing);
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
		return false;
	}

	

}
