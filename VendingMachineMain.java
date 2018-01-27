package AdvancedJavaTest;

import java.util.Scanner;

public class VendingMachineMain 
{
	public static void main(String[] args)
	{
		VendingMachine vm=new VendingMachine();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter what you need");
		try 
		{
			String de=sc.next();
			String demand=de.toLowerCase();
			System.out.println("Please enter how many you need");
			int count=sc.nextInt();
			sc.close();			
			vm.update(demand,count);
		}
		catch (Exception e)
		{
			System.out.println("Sorry We dont have that drink");
		}
	}

}
