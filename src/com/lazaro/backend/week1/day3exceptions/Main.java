package com.lazaro.backend.week1.day3exceptions;

public class Main {

	public static void main(String[] args) {
		try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: División by 0.");
        } finally {
            System.out.println("Finally block executed.");
        }
	}

}
