package june_08;

public class Ex09_test {

	public static int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	
	public static int getSum(int[] a) { // 배열타입으로 선언 // 참조 변수
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = add(a,b);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
		}
		
		int result2 = getSum(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(result2);
	}
}
