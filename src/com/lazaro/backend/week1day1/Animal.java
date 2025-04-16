package com.lazaro.backend.week1day1;

public class Animal {
	//A private modifier allows to access just from the same class.
	private String name;
	private Integer age;

	//This is a  constructor, each time an Animal is instanced (created) the parameter must be defined
	public Animal(String name, Integer age) {
		this.name = name;//this is to access to the own current object
		this.age = age;
	}
	
	//A public modifier allows to access from anywhere in the project.
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void makeSound() {
		System.out.println("Make a sound");
	}
}
