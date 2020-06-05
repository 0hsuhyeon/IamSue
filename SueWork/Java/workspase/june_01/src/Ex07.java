
public class Ex07 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int[] brr = new int[10];
		
		
		// System.arraycopy( Arr1,	0,	Arr2,	0,	Arr1.length);
		System.arraycopy(arr,0,brr,0,arr.length);
		
		
		for (int i = 0; i < brr.length; i++) {
			System.out.printf("%5d", brr[i]);
		}
		
	}
}
