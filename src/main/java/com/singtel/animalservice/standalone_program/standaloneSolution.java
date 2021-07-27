package com.singtel.animalservice.standalone_program;

import java.util.ArrayList;
import java.util.List;

import com.singtel.animalservice.bean.Animal;
import com.singtel.animalservice.bean.Bird;
import com.singtel.animalservice.bean.Butterfly;
import com.singtel.animalservice.bean.Cat;
import com.singtel.animalservice.bean.Chicken;
import com.singtel.animalservice.bean.Clownfish;
import com.singtel.animalservice.bean.Dog;
import com.singtel.animalservice.bean.Dolphin;
import com.singtel.animalservice.bean.Duck;
import com.singtel.animalservice.bean.Parrot;
import com.singtel.animalservice.bean.Rooster;
import com.singtel.animalservice.bean.Shark;



public class standaloneSolution {
	
	
	public static void main(String[] args) {
		System.out.println("***DUCK***");
		Animal myDuck =  new Duck();
		myDuck.walk();
		myDuck.fly();
		myDuck.sing();
		System.out.println("");
		
		System.out.println("***CHICKEN***");
		Animal myChicken =  new Chicken();
		myChicken.walk();
		myChicken.fly();
		myChicken.sing();
		System.out.println("");
		
		System.out.println("***ROOSTER***");
		Animal myRooster =  new Rooster();
		myRooster.walk();
		myRooster.fly();
		myRooster.sing();
		System.out.println("");
		
//		System.out.println("***ROOSTER WITH CHICHKEN DEPENDENCY ***");
//		RoosterWithChickenDependency myRoosterDel =  new RoosterWithChickenDependency();
//		myRoosterDel.walk();
//		myRoosterDel.fly();
//		myRoosterDel.sing();
//		System.out.println("");
		
		System.out.println("***PARROT LIVING WITH DOGS***");
		Parrot myParrotwithDogs =  new Parrot();
		myParrotwithDogs.livingWith("dog");
		myParrotwithDogs.walk();
		myParrotwithDogs.fly();
		myParrotwithDogs.sing();
		System.out.println("");
		
		System.out.println("***PARROT LIVING WITH CATS***");
		Parrot myParrotwithCats =  new Parrot();
		myParrotwithCats.livingWith("cat");
		myParrotwithCats.walk();
		myParrotwithCats.fly();
		myParrotwithCats.sing();
		System.out.println("");
		
		System.out.println("***PARROT LIVING WITH ROOSTERS***");
		Parrot myParrotWithRoosters =  new Parrot();
		myParrotWithRoosters.livingWith("rooster");
		myParrotWithRoosters.walk();
		myParrotWithRoosters.fly();
		myParrotWithRoosters.sing();
		System.out.println("");
		
		System.out.println("***PARROT LIVING WITH DUCKS***");
		Parrot myParrotWithDucks =  new Parrot();
		myParrotWithDucks.livingWith("");
		myParrotWithDucks.walk();
		myParrotWithDucks.fly();
		myParrotWithDucks.sing();
		System.out.println("");
		
		System.out.println("***SHARK***");
		Shark mySFish = new Shark();
		mySFish.fly();
		mySFish.sing();
		mySFish.walk();
		mySFish.swim();
		mySFish.colour();
		mySFish.eat();
		mySFish.size();
		mySFish.makeJokes();
		
		System.out.println("");
		
		System.out.println("***CLOWNFISH***");
		Clownfish myCFish = new Clownfish();
		myCFish.fly();
		myCFish.sing();
		myCFish.walk();
		myCFish.swim();
		myCFish.colour();
		myCFish.eat();
		myCFish.size();
		myCFish.makeJokes();
		System.out.println("");
		
		System.out.println("***DOLPHIN***");
		Dolphin dolphin = new Dolphin();
		dolphin.hasFishProperties(new Shark());
		dolphin.fly();
		dolphin.sing();
		dolphin.swim();
		dolphin.walk();
		System.out.println("");
		
		System.out.println("***BUTTERFLY***");
		Butterfly myButterFly =  new Butterfly();
		myButterFly.setMorph("");
		myButterFly.fly();
		myButterFly.sing();
		myButterFly.walk();
		System.out.println("");
		
		System.out.println("***CATERPILLAR***");
		Butterfly myCaterpillar =  new Butterfly();
		myCaterpillar.setMorph("caterpillar");
		myCaterpillar.fly();
		myCaterpillar.sing();
		myCaterpillar.walk();
		
		System.out.println("< ************************************************************************** >"); 
		System.out.println("");
		System.out.println("");
		System.out.println("NOW,LETS COUNT THE ANIMALS");
		Animal[] animals = new Animal[]{
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Shark(),
				new Clownfish(),
				new Dog(),
				new Butterfly(),
				new Cat()
		};
		int countFlying = 0 ;
		int countWalk = 0 ;
		int countSing = 0 ;
		int countSwim = 0 ;
		
		System.out.println("<COUNT>");
		System.out.println("< ************************************************************************** >"); 
		
		for (Animal animal : animals) {
			System.out.println("----------------");
			System.out.println(animal.getClass().getSimpleName().toUpperCase());
			System.out.println("----------------");

			if(animal.fly())
				countFlying++;
			if(animal.walk())
				countWalk++;
			if(animal.sing())
				countSing++;
			if(animal.swim())
				countSwim++;



		}

		System.out.println("< ************************************************************************** >"); 
		System.out.println("</COUNT>");
		System.out.println("");
		System.out.println("Number of Animals that can fly: " + countFlying);
		System.out.println("Number of Animals that can walk: " + countWalk);
		System.out.println("Number of Animals that can sing: " + countSing);
		System.out.println("Number of Animals that can swim: " + countSwim);

		System.out.println("< ************************************************************************** >"); 
		System.out.println("");
		System.out.println("");
		System.out.println("<ROOSTER TEST>"); 
		System.out.println("");

		Rooster myRstr = new Rooster();
		List<String> arrayList = new ArrayList<String>(){{
			add("English");
			add("Danish");
			add("Dutch");
			add("Finnish");
			add("French");
			add("German");
			add("Greek");
			add("Hebrew");
			add("Hungarian");
			add("Italian");
			add("Japanese");
			add("Portuguese");
			add("Russian");
			add("Swedish");
			add("Turkish");
			add("Urdu");
		}}; 

		for (String lang : arrayList) {
			
			myRstr.singInLanguage(lang);
			
			System.out.print(lang+ ": ");
			myRstr.sing();
		}
	}

}
