import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import org.junit.Test;

import com.training.stream.Trader;
import com.training.stream.Transaction;
import com.training.stream.TransactionDao;

public class TestTransactionDao {
	
//	@Test
//	public void testTransactionValuesOfTradersInDelhi() {
//		List<Transaction> transactions = Arrays.asList(
//				new Transaction(new Trader("Abc","Pune"),2010,2000),
//				new Transaction(new Trader("Def","Delhi"),2011,5000),
//				new Transaction(new Trader("ghi","Delhi"),2011,3400),
//				new Transaction(new Trader("jkl","Hyd"),2009,5500),
//				new Transaction(new Trader("mno","Pune"),2011,8000));
//		List<Transaction> expected = new ArrayList(Arrays.asList(5000,3400));
//		TransactionDao dao = new TransactionDao();
//		assertEquals(expected, dao.findTransactionValuesOfTradersFromDelhi(transactions));
//	}
	
	@Test
	public void testFindSmallestValue() {
		List<Transaction> transactions = Arrays.asList(
				new Transaction(new Trader("Abc","Pune"),2010,2000),
				new Transaction(new Trader("Def","Delhi"),2011,5000),
				new Transaction(new Trader("ghi","Delhi"),2011,3400),
				new Transaction(new Trader("jkl","Hyd"),2009,5500),
				new Transaction(new Trader("mno","Pune"),2011,8000));
		
		TransactionDao dao = new TransactionDao();
		assertEquals(2000, dao.findSmallestValue(transactions));
	}
	
	
	
	//Printing all the transactions
	//List<Transaction> transactions = dao.findAllTransaction();
	//System.out.println(transactions);
	
	//Getting smallest value of all transactions
	//OptionalInt smallestValue = transactions.stream().mapToInt(t -> t.getValue()).min();
	//System.out.println(smallestValue);
	//assertEquals(2000, smallestValue);
	
	//Getting highest value of all transactions
	//OptionalInt highestValue = transactions.stream().mapToInt(t -> t.getValue()).max();
	//System.out.println(highestValue);

	//Transaction values for the traders living in Delhi
	//List<Transaction> tradersInDelhi = transactions.stream().filter(t -> t.getCity().equals("Delhi")).collect(Collectors.toList());
	//tradersInDelhi.forEach(t -> System.out.println(t.getValue()));
	
	//Unique Cities where traders work
	//List<String> unique = transactions.stream().map(t -> t.getCity()).distinct().collect(Collectors.toList());
	//unique.forEach(t ->
			
	//find transactions in 2011 and sort them by value
	//List<Transactions> sort = transactions.stream().filter(e -> e.getYear())
	
	//find pune traders and sort them by name
//	List<Transaction> puneTraders = transactions.stream().filter(e -> e.getCity().equals("Pune")).sorted((e1,e2) ->{
//		                                            int result = e1.getName().compareTo(e2.getName());
//		                                            return result;}).collect(Collectors.toList());
//	System.out.println(puneTraders);
}

