package Array;

public class maxMin {

	static int max(int[] arr,int size) {
		int minimum = Integer.MIN_VALUE;
		
		for (int i = 0;i<size;i++) {
			if (arr[i]>minimum)
				minimum = arr[i];
			
		}
		
		return minimum;
	}
	
	static int min(int arr[],int size) {
		
		int maximum = Integer.MAX_VALUE;
		for (int i = 0;i<size;i++) {
			if (arr[i]<maximum)
				maximum = arr[i];
		}
		return maximum;
	}
	
	
	public static void main(String[] args) {
		
		 int[] intArray = new int[]{2000,20,30,50,100,90};
		 System.out.println(max(intArray,intArray.length));
		 System.out.println(min(intArray,intArray.length));
		
	}

}
