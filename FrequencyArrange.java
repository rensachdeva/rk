/*4.	Sort elements by frequency. Sort elements of an array by frequency of the elements of the array. 
 * Sort the elements by increasing order of their frequency. If two elements have same frequency then 
 * retain their order in input array. *
if input array is 2,5,3,8,7,2,5,2,3
then output should be 2,,2,2,5,5,3,3,8,7
In the above output5 and 3 occurs twice each, but 5 comes first because it appears first in the input array.*/
package AdvancedJavaTest;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class FrequencyArrange 
{

	    public static void main(String[] args) {
	        int nums[] = {5,2,8,8,5,5,8} ;
	        LinkedHashMap<Integer,Integer> counts = new LinkedHashMap<Integer,Integer>();

	        for(int i = 0; i < nums.length; i++) {
	            if(counts.containsKey(nums[i]))
	            		{
	            			Integer c = counts.get(nums[i]) + 1;
	            			counts.put(nums[i], c);
	            }
	            else {
	                counts.put(nums[i],1);
	            }
	        }

	        ValueComparator<Integer,Integer> bvc = new ValueComparator<Integer,Integer>(counts);
	        TreeMap<Integer,Integer> sortedMap = new TreeMap<Integer,Integer>(bvc);
	        sortedMap.putAll(counts);

	        ArrayList<Integer> output = new ArrayList<Integer>();
	        for(Integer i : sortedMap.keySet()) {
	            for(int c = 0; c < sortedMap.get(i); c++) {
	                output.add(i);
	            }
	        }

	        System.out.println(output.toString());
	    }
	}