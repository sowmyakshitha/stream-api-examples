package com.training.stream;

import java.util.stream.Collectors;

import org.junit.Test;

import com.sun.tools.javac.util.List;

public class TestFruit {
	
	@Test
	public void testFruit() {
		FruitDao dao = new FruitDao();
		
		List<Fruit> fruits = (List<Fruit>) dao.findAllFruits();
		List<Fruit> redColorFruits = fruits.stream().filter(e -> e.getColor().equalsIgnoreCase("red"))
				                           .sorted((e1,e2) ->e1.getPrice() > e2.getPrice()).collect(Collectors.toList());
	}

}
