import java.util.Scanner;

public class Ex02_test {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int add = test(10,80);
		System.out.printf("합의 결과:%d\n", add);
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	//test 메소드
	public static int test(int x, int y){
		return x + y;
		
	}
}
