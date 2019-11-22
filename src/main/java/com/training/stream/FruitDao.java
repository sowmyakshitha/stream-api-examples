package com.training.stream;

import java.util.Arrays;
import java.util.List;

public class FruitDao {
	
	List<Fruit> findAllFruits(){
		
		List<Fruit> fruits = Arrays.asList(
				new Fruit("Apple",70,70,"Red"),
				new Fruit("Banana",45,40,"Yellow"),
				new Fruit("Mango",40,100,"Yellow"),
				new Fruit("Grapes",90,50,"Green"),
				new Fruit("Cherry",20,30,"Red"));
		return fruits;
	}

}
