package AdvancedJavaTest;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

 
public class RankStudents 
{
	    public static void main(String a[])
	    {
	        //By using marks comparator (int comparison)
	        TreeMap<Integer,StudentTree> treeMap = new TreeMap<Integer,StudentTree>(new MarksComp());
	        StudentTree stu1 = new StudentTree("Ram",30,690);
	        StudentTree stu2 = new StudentTree("John",60,567);
	        StudentTree stu3 = new StudentTree("Crish",20,458);
	        StudentTree stu4 = new StudentTree("Tom",24,345);
	        StudentTree stu5 = new StudentTree("Thomas",28,456);

	        treeMap.put(stu1.getMarks(),stu1);
	        treeMap.put(stu2.getMarks(),stu2);
	        treeMap.put(stu3.getMarks(),stu3); 
	        treeMap.put(stu4.getMarks(),stu4);
	        treeMap.put(stu5.getMarks(),stu5);
	        System.out.println(stu1);
	        
	        Set<Integer> ks = treeMap.keySet();
	        Iterator<Integer> it = ks.iterator();
	        //Iterator<> it = StudentTree.iterator();
	        
	        while(it.hasNext())
	        {
	            System.out.println(it.next()+" ==> ");
	        }
	    
	    }
}
	 
class MarksComp implements Comparator<Integer>
{
	 
	    @Override
	    public int compare(Integer e1, Integer e2) 
	    {
	        if(e1 < e2)
	        {
	            return 1;
	        } else 
	        {
	            return -1;
	        }
	    }

	
	    @Override
		 public boolean equals(Object arg0)
		 {	
			  if(arg0 instanceof StudentTree) 
			  { 
			    return (((StudentTree)arg0).getName().equals((StudentTree)arg0));
			  }
			  return (((StudentTree)arg0).getName().equals((StudentTree)arg0));
			   //return false;
		  
		 }
}
