package com.lazaro.backend.week1day1;

public class Cat extends Animal implements Pet{

	public Cat(String name, Integer age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void makeSound() {
		System.out.println("meow, meow");
	}

	@Override
	public void play() {
		System.out.println(getName()+" is playing with nothing because cats are not stupids... or at least that is what they think.");
	}
	
	

}
