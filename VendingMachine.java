package AdvancedJavaTest;

import java.util.HashMap;

public class VendingMachine 
{
		private HashMap<String, Integer> hs =new HashMap<String, Integer>();
		private void invertory()
		{
			hs.put("coke", 20);
			hs.put("limca", 2);
			hs.put("fanta", 12);
			hs.put("bunta", 32);
		}

		public void update(String drink,int count)
		{		
			invertory();			
			if(hs.containsKey(drink)&&count<=hs.get(drink))
			{
				System.out.println("Here is you drink sir: "+ drink);
				hs.put(drink, (hs.get(drink))-count);
				System.out.println("We have "+hs.get(drink)+ " more");
			}
			else if(count>hs.get(drink))
			{
				System.out.println("Sorry, we only have "+hs.get(drink));
			}	
			
		}
		
}
