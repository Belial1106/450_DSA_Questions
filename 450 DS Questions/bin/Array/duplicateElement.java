package Array;

public class duplicateElement {

	static int returnDuplicate(int arr[]) {
		int n = arr.length;
		int result =0;
		//First updating the array elements as in index 
		//adding n to the respective indices
		
		for (int i=0;i<n;i++) {
			arr[arr[i]%n] = arr[arr[i]%n]+n; 
		}
		
		//after updating elements we divide them by size of the array 
		// and if it is more than 1,element in that index is repeated
		
		for (int i =0;i<n;i++) {
			if(arr[i]/n>1)
				result = i;
		}
		
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = new int[] {2,2,1,3,4};
		
		System.out.println(returnDuplicate(arr));
		

	}

}
