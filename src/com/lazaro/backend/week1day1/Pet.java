package com.lazaro.backend.week1day1;

public interface Pet {
	/*
	 * An interface defines a contract, there is not implementation.
	 * You can defines "what to do" but not "how to do it".
	 * But each class implementing this interface, must define "how to do it" which means the methods behavior.
	*/
	
	//The IDE is not asking for a behavior in the method, because it is an interface.
	void play();
}
