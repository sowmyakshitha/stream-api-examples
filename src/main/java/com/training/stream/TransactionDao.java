package com.training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class TransactionDao {
	
//	//Trader trader = new Trader();
//	public List<Transaction> findTransactionValuesOfTradersFromDelhi(List<Transaction> transactions){
//		List<Transaction> tradersInDelhi = transactions.stream().filter(t -> t.getCity().equals("Delhi")).collect(Collectors.toList());
//		return tradersInDelhi;
//	}
	
	public OptionalInt findSmallestValue(List<Transaction> transactions) {
		OptionalInt smallestValue = transactions.stream().mapToInt(t -> t.getValue()).min();
		return smallestValue;
	}
	
	
}
