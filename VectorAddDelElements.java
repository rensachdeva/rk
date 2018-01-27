/*6.	Write a program to insert "tekarch" into vector then insert user input number(N) of Z's from 3rd position. Delete N characters from 6th position from vector *
a) Example if user input=5
b) Then vector stores="tekZZZZZarch"
c)Delete 5 characters from the 6th position do final string="tekZZZh"*/
package AdvancedJavaTest;
import java.util.Scanner;
import java.util.Vector;

public class VectorAddDelElements {
	static Vector<String> v_vector= new Vector<String>();

	public static void addZs(Vector<String> v_vector) 
	{
		v_vector.add("T");
		v_vector.add("e");
		v_vector.add("k");
		v_vector.add("a");
		v_vector.add("r");
		v_vector.add("c");
		v_vector.add("h");
		
		//Taking user input for number of Z's
		Scanner inputUser=new Scanner(System.in);
		System.out.println("Please enter the number of z's you want to put in tekarch");
		int num=inputUser.nextInt();
		
		for(int i=0;i<num;i++) 
		{
			v_vector.add(3,"Z");
			
		}
		System.out.println(v_vector);
		inputUser.close();
	}
	public static void delete(Vector<String> v_vector) 
	{
		for(int i=v_vector.size()-2 ; i>5; i=i-1)
	        {
				System.out.println("Removing element: "+v_vector.get(i));
	        	v_vector.remove(i);
	        }
	        
			System.out.println(v_vector);

			
	}
	
	
	public static void main(String[] args) 
	{
		Vector<String> v_vector= new Vector<String>();
		addZs(v_vector);
		delete(v_vector);
	}
		

}
