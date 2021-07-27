package com.singtel.animalservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.animalservice.bean.Animal;
import com.singtel.animalservice.bean.Butterfly;
import com.singtel.animalservice.bean.Cat;
import com.singtel.animalservice.bean.Chicken;
import com.singtel.animalservice.bean.Clownfish;
import com.singtel.animalservice.bean.Dog;
import com.singtel.animalservice.bean.Dolphin;
import com.singtel.animalservice.bean.Duck;
import com.singtel.animalservice.bean.Fishes;
import com.singtel.animalservice.bean.Parrot;
import com.singtel.animalservice.bean.Rooster;
import com.singtel.animalservice.bean.Shark;

@RestController
public class AnimalController {

	private final List<String> languageList= Arrays.asList(new String[] {"English","Danish","Dutch","Finnish","French","German","Greek",
			"Hebrew","Hungarian","Italian","Japanese","Portuguese","Russian","Swedish","Turkish","Urdu"});
	

	
	@RequestMapping(
			value = "/animals", 
			method = RequestMethod.GET, 
			headers = "Accept=application/json")
	@ResponseBody
	public List<Animal> getAnimals()
	{
		List<Animal> listOfAnimals = new ArrayList();

		listOfAnimals=createAnimalList();
		return listOfAnimals;
	}


	@RequestMapping(
			value = "/animals/{name}", 
			method = RequestMethod.GET, 
			headers = "Accept=application/json")
	@ResponseBody
	public Animal getAnimalByName(@PathVariable String name)
	{
		List <Animal>listOfAnimals = new ArrayList();
		listOfAnimals=createAnimalList();

		for (Animal animal: listOfAnimals) {
			if(animal.getName().equalsIgnoreCase(name))
				return animal;
		}

		return null;
	}

	@RequestMapping(
			value = "/animals/{name}/{morph}", 
			method = RequestMethod.GET, 
			headers = "Accept=application/json")
	@ResponseBody
	public Animal getAnimalByNameAndMorphType(@PathVariable String name, @PathVariable String morph)
	{
		List <Animal>listOfAnimals = new ArrayList();
		listOfAnimals=createAnimalList();

		for (Animal animal: listOfAnimals) {
			if(animal.getName().equalsIgnoreCase(name)) {

				if(name.equalsIgnoreCase("butterfly") && morph.equalsIgnoreCase("caterpillar")) {
					animal.setMorph(morph);
				}
				
				else if(name.equalsIgnoreCase("parrot")) {
					animal.livingWith(morph);
				}
				
				else if (languageList.contains(morph)) {
					animal.singInLanguage(morph);
				}
				
				
				return animal;

			}

			
		}
		return null;
	}



	public List<Animal> createAnimalList()
	{
		Animal duck=new Duck();
		Animal chicken=new Chicken();
		Animal cat=new Cat();
		Animal dog=new Dog();

		Animal butterfly=new Butterfly();
		
		Fishes shark=new Shark();
		Fishes clownfish=new Clownfish();
		
		Dolphin dolphin = new Dolphin();
		dolphin.hasFishProperties(new Shark());
		
		Animal parrot=new Parrot();
		Animal rooster=new Rooster();


		List<Animal> listOfAnimals = new ArrayList<>();

		listOfAnimals.add(duck);
		listOfAnimals.add(chicken);
		listOfAnimals.add(cat);
		listOfAnimals.add(dog);

		listOfAnimals.add(butterfly);
		
		listOfAnimals.add(shark);
		listOfAnimals.add(clownfish);
		
		listOfAnimals.add(dolphin);

		listOfAnimals.add(parrot);
		listOfAnimals.add(rooster);
		
		return listOfAnimals;
	}


}
