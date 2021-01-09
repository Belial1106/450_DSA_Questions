package Array;

import java.util.Arrays;

public class kthMin {
	
	
	static int kMin(int[] arr,int size,int k) {
		int min = Integer.MIN_VALUE;
	    
	    Arrays.sort(arr);

	    
	    // Method 1	    
//	    for (int i = 0 ;i<k;i++){
//	        if (arr[i]>min)
//	            min = arr[i];
//	    }
//	    
//	    return min;
	    
	    
	   // Method 2
	    
	    return arr[k-1];

		
		
	}
	
	

	public static void main(String[] args) {
		int[] arr = new int[] {7,10,4,3,20,15};
		int size = arr.length;
		
		System.out.println(kMin(arr,size,3));
		
	}

}
