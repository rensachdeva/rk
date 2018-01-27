package AdvancedJavaTest;
public class DollarsToCoins 
{
	static int amount;
	static int dollar,quarters,dimes,pennies;
	
	public static void denominations(int amount)
	{
			dollar=amount/100;
			amount=amount%100;
			quarters=amount/25;
			amount=amount%25;
			dimes=amount/10;
			amount=amount%10;
			pennies=amount;
			System.out.println("It's "+dollar+" dollars, "+quarters+" quarters, "+dimes+" dimes and "+pennies+" pennies.");
			System.out.print("Total ");
			System.out.print(dollar+quarters+dimes+pennies+" coins.");
	}
	
}


