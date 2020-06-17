
public class Ex05_Test1 {

	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int comSum(int[] a) {
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum+=a[1];
		}
		return sum;
	}
	
	public static int comSum1(int ...a) {
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum+=a[1];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int result = add(10,20);
		System.out.printf("Result:%d",result);
		
		int [] arr = new int[5];
		int result1 = comSum(arr);
		System.out.printf("\nResult:%d",result1);
		
		int result2 = comSum1(10,20,30,40,50);
		System.out.printf("\nResult:%d",result2);
	}
}
