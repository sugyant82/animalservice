package com.singtel.animalservice.bean;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken{

	private String type="BIRD";
	private String name="ROOSTER";
	
	private String sing = "Cock-a-doodle-doo";
	
	private static final Map<String, String> languageProperties;
	static
	{
		languageProperties = new HashMap<String, String>();

		languageProperties.put("English", "Cock-a-doodle-doo");
		languageProperties.put("Danish", "kykyliky");
		languageProperties.put("Dutch", "kukeleku");
		languageProperties.put("Finnish", "kukko kiekuu");
		languageProperties.put("French", "cocorico");
		languageProperties.put("German", "kikeriki");
		languageProperties.put("Greek", "kikiriki");
		languageProperties.put("Hebrew", "coo-koo-ri-koo");
		languageProperties.put("Hungarian", "kukuriku");
		languageProperties.put("Italian", "chicchirichi");
		languageProperties.put("Japanese", "ko-ke-kok-ko-o");
		languageProperties.put("Portuguese", "cucurucu");
		languageProperties.put("Russian", "kukareku");
		languageProperties.put("Swedish", "kuckeliku");
		languageProperties.put("Turkish", "kuk-kurri-kuuu");
		languageProperties.put("Urdu", "kuklooku");

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
		System.out.println(super.fly);
		return false;
	}

	@Override
	public boolean sing() {

		System.out.println(sing);
		return true;
	}
	
	@Override
	public boolean walk() {

		System.out.println(super.walk);
		return true;
	}
	
	@Override
	public boolean swim() {

		System.out.println(super.swim);
		return false;
	}
	
	
	public boolean singInLanguage(String language) {

		if(!(null== language || language.isEmpty()))
		{
			this.sing=languageProperties.get(language);
		}


		return true;
	}

	

}
