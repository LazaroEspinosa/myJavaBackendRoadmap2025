package com.lazaro.backend.week1.day1oop;

public class Dog extends Animal implements Pet {

	//This constructor avoid to create an empty object, must be provided by the parameters defined (name, age)
	public Dog(String name, Integer age) {
		super(name, age);//Super access to the Base Class
	}
	
	//This Override could be skipped but it is a good practice, it indicates you can 
	@Override
	public void makeSound() {
		System.out.println("wof wof");
	}

	//Look, we did not create the getName method here, but this class extends from Animal.
	//so it can uses each public, default or protected method available.
	@Override
	public void play() {
		System.out.println(getName()+" is playing with the ball");
	}
}