package com.lazaro.backend.week1.day2collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Lazaro");
		nombres.add("David");
		nombres.add("Julio");
		nombres.add("Mike");
		nombres.add("Adrian");
		nombres.add("Javier");
		nombres.add("Mike");
		
		System.out.println(nombres);
		
		for(String nombre:nombres) {
			System.out.println(nombre);
		}
		
		nombres.remove(nombres.size()-1);
		
		System.out.println(nombres);
		
		HashMap<String,Double> inventario = new HashMap<>();
		/*
		 * Common operations:
		 * put(key, valor): add or update a key-value par.
		 * get(key):obtain the value related to the key.
		 * remove(key): Delete the key-value par.
		 * containsKey(key): Verify if the key exist.
		 * keySet(): Return a collection with all keys.
		 */
		inventario.put(nombres.get(0), 150.0);
		inventario.put(nombres.get(1), 155.0);
		inventario.put(nombres.get(2), 255.0);
		inventario.put(nombres.get(3), 250.0);
		
		if (inventario.containsKey("Julio")) {
			System.out.println("El precio de Julio es "+inventario.get("Julio"));
			inventario.put("Julio", 355.0);
			System.out.println("El precio de Julio es "+inventario.get("Julio"));
			inventario.remove("Julio");
			System.out.println("Valor de Julio eliminado");
			System.out.println("El precio de Julio es "+inventario.get("Julio"));
		}
		
		HashSet<Integer> codigosUnicos = new HashSet<>();
		/*
		 * add(object): add an object.
		 * remove(object): delete an object.
		 * contains(object): Verify if the object exist.
		 * size(): Return the number of elements
		 */
		for(int i =0;i<10;i++) {
			codigosUnicos.add((int)(Math.random()*99999));
			System.out.println(codigosUnicos);
		}
	}

}
