package Array;

import java.util.*;
import java.lang.*;
import java.io.*;

public class unionFind {
	
	    
	    
	    static void print_union(int arr1[],int arr2[]){
	    	int count = 0;
	      HashSet<Integer> hs = new HashSet<>();
	      
	      for (int i = 0;i<arr1.length;i++)
	      {
	    	  hs.add(arr1[i]);
	      }
	       
	      for (int i = 0;i<arr2.length;i++)
	      {
	    	  hs.add(arr2[i]);
	      }
	      
	   int size = hs.size();
	   
	   for (int i =0;i<size;i++) {
		   count++;
	   }
	      
	      
	
	   System.out.println("The union is:" + hs);
	   
	   
	        
	  
}
	    
	    static void print_Intersection(int arr1[],int arr2[]){
	    	int count = 0;
	      HashSet<Integer> hs = new HashSet<>();
	      
	      for (int i = 0;i<arr1.length;i++)
	      {
	    	  hs.add(arr1[i]);
	      }
	       
	      for (int i = 0;i<arr2.length;i++)
	      {	
	    	  if (hs.contains(arr2[i])) {
	    		  System.out.print(arr2[i]+" ");
	    	  }
	    	 
	      }
	      
	
 }
	    
		public static void main (String[] args) {
			int[] arr1 = new int[]{1,2,3,4,5,6,7};
			int[] arr2 = new int[]{1,2,3};
			print_union(arr1,arr2);
			print_Intersection(arr1,arr2);
	}	

}
