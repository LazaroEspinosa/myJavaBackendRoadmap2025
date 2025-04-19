package com.lazaro.backend.week1.day1oop;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//Creating and starting new objects
		//Polymorphism
		Animal cat1 = new Cat("Don Gato",3);
		Animal dog1 = new Dog("Coraje",5);
		Cat cat2= new Cat("Garfield", 7);
		Dog dog2= new Dog("Jake", 7);

		
		ArrayList<Animal>animalList=new ArrayList<>();
		animalList.add(cat1);
		animalList.add(cat2);
		animalList.add(dog1);
		animalList.add(dog2);

		for(Animal animal:animalList) {
			animal.makeSound();
			if(animal instanceof Pet) {//instance of
				((Pet)animal).play();
			}
		}
	}

}
