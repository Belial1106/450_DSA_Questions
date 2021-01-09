package Array;

public class newSort {
	
	static void sort(int[] arr,int size) {
		int count_0= 0,count_1 = 0,count_2 = 0;
		for (int i =0;i<size;i++) {
			if (arr[i]==0)
				count_0++;
			if (arr[i]==1)
				count_1++;
			if (arr[i]==2)
				count_2++;
		}
		
		for(int i =0;i<count_0;i++) {
			arr[i]=0;
		}
		
		for (int i = count_0;i<(count_0+count_1);i++){
			arr[i] = 1;
		}
		
		for (int i=(count_0+count_1);i<size;i++) {
			arr[i] = 2;
		}
	}
	
	static void printArray(int[] arr,int size) {
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		int[] arr = new int[] {0,2,1,2,0};
		int size = arr.length;
		
		sort(arr,size);
		printArray(arr,size);

	}

}
