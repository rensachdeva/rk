/* 2.	Write a java program to store 5 students 
*information in a treeMap Note: student object has student 
*name and student reg no. */

package AdvancedJavaTest;

import java.util.TreeMap;

public class TreeMapStudent {

	public static void main(String[] args) 
		{
			TreeMap<StudentTree, Integer> mapTree=new TreeMap<StudentTree ,Integer>();
			StudentTree stu1 =new StudentTree("radha", 21);
			StudentTree stu2 =new StudentTree("radha1", 25);
			StudentTree stu3 =new StudentTree("radha2", 41);
			StudentTree stu4 =new StudentTree("radha3", 49);
			StudentTree stu5 =new StudentTree("radha4", 79);			

			
			mapTree.put(stu1, stu1.getRegNum());
			mapTree.put(stu2, stu2.getRegNum());
			mapTree.put(stu3, stu3.getRegNum());
			mapTree.put(stu4, stu4.getRegNum());	
			mapTree.put(stu5, stu5.getRegNum());	

			
		}//end of main
		
}//end of class



