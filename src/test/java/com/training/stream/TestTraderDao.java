package com.training.stream;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestTraderDao {

	@Test
	public void testToFindUniqueCities() {
		List<Trader> traders = new ArrayList<>();
		Trader trader1 = new Trader("manoj", "Pune");
		Trader trader2 = new Trader("Arjun", "Pune");
		Trader trader3 = new Trader("anu", "Delhi");
		Trader trader4 = new Trader("pinky", "Delhi");
		Trader trader5 = new Trader("monika", "Hyd");
		Trader trader6 = new Trader("mamatha", "Pune");
		Trader trader7 = new Trader("sindhu", "indore");
		Trader trader8 = new Trader("priya", "Pune");
		
		traders.add(trader1);
		traders.add(trader2);
		traders.add(trader3);
		traders.add(trader4);
		traders.add(trader5);
		traders.add(trader6);
		traders.add(trader7);
		traders.add(trader8);
		
		List<String> expected = new ArrayList(Arrays.asList("Pune","Delhi","Hyd","indore"));
		TraderDao dao = new TraderDao();
		assertEquals(expected, dao.uniqueCities(traders));
	}
	
	@Test
	public void testFindPuneTradersAndSortByName() {
		List<Trader> traders = new ArrayList<>();
		Trader trader1 = new Trader("manoj", "Pune");
		Trader trader2 = new Trader("Arjun", "Pune");
		Trader trader3 = new Trader("anu", "Delhi");
		Trader trader4 = new Trader("pinky", "Delhi");
		Trader trader5 = new Trader("monika", "Hyd");
		Trader trader6 = new Trader("mamatha", "Pune");
		Trader trader7 = new Trader("sindhu", "indore");
		Trader trader8 = new Trader("priya", "Pune");
		
		traders.add(trader1);
		traders.add(trader2);
		traders.add(trader3);
		traders.add(trader4);
		traders.add(trader5);
		traders.add(trader6);
		traders.add(trader7);
		traders.add(trader8);
		
		List<Trader> expected = new ArrayList(Arrays.asList(trader2,trader6,trader1,trader8));
		TraderDao dao = new TraderDao();
		List<Trader> actual = new ArrayList(dao.puneTraders(traders));
		assertEquals(expected, actual);
	}
	
	@Test
	public void testToFindTrainersInIndore() {
		List<Trader> traders = new ArrayList<>();
		Trader trader1 = new Trader("manoj", "Pune");
		Trader trader2 = new Trader("Arjun", "Pune");
		Trader trader3 = new Trader("anu", "Delhi");
		Trader trader4 = new Trader("pinky", "Delhi");
		Trader trader5 = new Trader("monika", "Hyd");
		Trader trader6 = new Trader("mamatha", "Pune");
		Trader trader7 = new Trader("sindhu", "indore");
		Trader trader8 = new Trader("priya", "Pune");
		
		traders.add(trader1);
		traders.add(trader2);
		traders.add(trader3);
		traders.add(trader4);
		traders.add(trader5);
		traders.add(trader6);
		traders.add(trader7);
		traders.add(trader8);
		
		List<Trader> expected = new ArrayList(Arrays.asList(trader7));
		TraderDao dao = new TraderDao();
		List<Trader> actual = new ArrayList(dao.tradersInIndore(traders));
		assertEquals(expected, actual);
	}

}
