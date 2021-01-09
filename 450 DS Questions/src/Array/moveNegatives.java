package Array;

public class moveNegatives {
	
	static void moveNeg(int a[]) {
		
		int size = a.length;
		int i=0;int j = 0;
		
		for (i=0;i<size;i++) {
			
			if (a[i]<0) {
				if (i!=j) {
					int temp  = a[i];
					a[i] = a[j];
					a[j] = temp;
				
				}
				j++;
				
			}
			
			
		}
		
		for (i = 0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		//int size = a.length;
		moveNeg(a);

	}

}
