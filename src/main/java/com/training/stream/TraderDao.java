package com.training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TraderDao {
	
	public List<String> uniqueCities(List<Trader> traders){
		List<String> unique = traders.stream().map(t -> t.getCity()).distinct().collect(Collectors.toList());
		return unique;
	}
	
	public List<Trader> puneTraders(List<Trader> traders){
		List<Trader> pune = traders.stream().filter(e -> e.getCity().equals("Pune"))
				.sorted((e1,e2) ->{
				int result = e1.getName().compareTo(e2.getName());
				return result;})
				.collect(Collectors.toList());
				return pune;
	}
	
	public List<Trader> tradersInIndore(List<Trader> traders){
		List<Trader> indore = traders.stream().filter(e -> e.getCity().equals("indore")).collect(Collectors.toList());
		return indore;
		
		
	}

}
