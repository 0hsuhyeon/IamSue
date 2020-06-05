import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//int[] arr = {10,20,30,40,50}
		int[] a = new int[] {10,20,30,40,50};
		a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("정수%d", i+1);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
	}
}
