package com.singtel.animalservice.bean;

public class Clownfish implements Fishes{
	
	private String type="FISH";
	private String name="CLOWNFISH";
	
	private String size = "I am small";
	private String color= "I am orage colored";
	private String eat = "I do not eat other fishes";
	private String makeJokes = "I like to make jokes";

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public String getMakeJokes() {
		return makeJokes;
	}

	public void setMakeJokes(String makeJokes) {
		this.makeJokes = makeJokes;
	}

	@Override
	public void size() {
		System.out.println(size);
		
	}

	@Override
	public void colour() {
		System.out.println(color);
	}

	@Override
	public boolean eat() {
		System.out.println(eat);
		return true;
		
	}

	@Override
	public boolean makeJokes() {
		System.out.println(makeJokes);
		return false;
	}

	@Override
	public boolean fly() {
		System.out.println(fly);
		return false;
	}

	@Override
	public boolean sing() {
		System.out.println(sing);
		return false;
	}

	@Override
	public boolean walk() {
		System.out.println(walk);
		return false;
	}

	@Override
	public boolean swim() {
		System.out.println(swim);
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
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSing() {
		return sing;
	}


	public void setSing(String sings) {
	}


	public String getFly() {
		return fly;
	}


	public void setFly(String flies) {
	}


	public String getSwim() {
		return swim;
	}


	public void setSwim(String swims) {
	}


	public String getWalk() {
		return walk;
	}


	public void setWalk(String walks) {
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
