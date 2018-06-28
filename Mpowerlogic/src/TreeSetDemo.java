import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeMap<String,Double> tm=new TreeMap<String,Double>();
		tm.put("Abhi", 100.0);
		tm.put("Geetha", 10.0);
		tm.put("Gow", 900.0);
		Set<Map.Entry<String, Double>> hs=tm.entrySet();
		for(Map.Entry<String,Double>me:hs)
		{
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			}
			System.out.println();
			// Deposit 1000 into John Doe's account.
			double balance = tm.get("Gow");
			tm.put("Gow", balance + 1000);
			System.out.println("Gow's new balance: " +tm.get("Gow"));
			}
}
		
		
	


