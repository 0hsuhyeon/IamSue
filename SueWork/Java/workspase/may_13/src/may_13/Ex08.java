package may_13;

import java.util.Scanner;

// 입력받은 수가 짝수인지 홀수인지 판별하는 If문
public class Ex08 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int a = num.nextInt();
		
		if(a % 2 == 0)
			System.out.println("짝수");
		else 
			System.out.println("홀수");
		
		System.out.printf("입력받은 수는 %d 입니다.", a);

	}

}
