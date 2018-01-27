package AdvancedJavaTest;

import java.util.Scanner;

public class DollarsToCoinsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the amount in dollars");
		int amount=sc.nextInt();
		DollarsToCoins.denominations(amount);
		sc.close();
		
	}

}
