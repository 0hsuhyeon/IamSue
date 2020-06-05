import java.util.Scanner;

// 사용자로부터 입력받은 두 수의 합과 차를 구하여 출력해보자, 두 수의 차는 큰 수에서 작은 수를 뺀 것으로 한다.

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("정수 A를 입력하세요");
		int a = n.nextInt();
		System.out.println("정수 B를 입력하세요");
		int b = n.nextInt();
		
			System.out.printf("두 수의 합= %d\n",(a+b));
		
		if(a>b) {
			System.out.printf("두 수의 차= %d\n", (a-b));
		}else {
			System.out.printf("두 수의 차= %d\n", (b-a));
		}
		
	}
	
}
