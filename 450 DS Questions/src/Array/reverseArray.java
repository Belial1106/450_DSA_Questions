package Array;

public class reverseArray {
	
	
	static void reverse(int[] arr,int size) {
		
		
		// method 1
//		int[] temp = new int[size];
//		
//		for (int i = size-1;i>=0;i--) {
//			
//			System.out.print(arr[i]+" ");
//		}	
		
		
		//method 2
		int i = 0;
		int j = size-1;
		int temp;
		
		while (i<j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			
			i++;
			j--;
			
			
			
		}
		
		for (i = 0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	
	}
			
		
	
	
	
	public static void main(String[] args) {
		 int[] arr = new int[]{1,2,3,4,5,6,7,8 };
		 int size = arr.length;
		 
		 reverse(arr,size);

	}

}

