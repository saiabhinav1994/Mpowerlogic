import java.util.Scanner;

public class MealPrice {

	public static void main(String[] args) {
		double mealCost;
		int tipPercent;
		int taxPercent;
		int tip;
		int tax;
		double totalCost;
		Scanner sa=new Scanner(System.in);
		Scanner st=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		mealCost=st.nextDouble();
		tipPercent=st.nextInt();
		taxPercent=sc.nextInt();
		totalCost=(mealCost+(mealCost*((double)tipPercent/100))+(mealCost*((double)taxPercent/100)));
		System.out.println("Total meal cost is "+ Math.round(totalCost) +  "\tDollars");
		
		

	}

}
