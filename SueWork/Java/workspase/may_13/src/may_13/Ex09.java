package may_13;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
	
		// 두개의 정수를 입력받아 하나는 분모 하나는 분자 
		// 만약 분모가 0이면 한줄은 입력오류 하고 한줄은 0은 분모로 사용 불가능하다고 출력
		
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();
		
		int result;
		
		if(b==0) {
			System.out.println("입력오류");
			System.out.println("0은 분모로 사용 불가");
		}else {
		
			System.out.println(a/b);
		}
		
	}
}
