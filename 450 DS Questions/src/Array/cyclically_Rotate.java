package Array;

public class cyclically_Rotate {
	
	static void rotate(int a[]) {
		int size =a.length;
		int i =0;int j = size-1;
		
		
		
		for (i =0;i<size;i++) {
			System.out.println(a[i]+" ");
		}
		
	}
	
	
	
	
		public static void main(String[] args) {
			int[] arr = new int[] {7,10,4,3,20,15};
			
			rotate(arr);
	}
}
