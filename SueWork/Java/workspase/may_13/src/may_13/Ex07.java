package may_13;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
	
		// 세 자리로 이루어진 십진수 양의 정수 값을 입력 받은 후에 각각의 자릿수를 분리하고 이 자릿수를 출력하는 프로그램을 작성하시오
		// 정수를 입력하시오 : 378/ 백의 자리수:3 / 십의 자리수:7 /일의 자리수:8
		
		Scanner ten = new Scanner(System.in);
		System.out.println("세자리 양의 정수를 입력하시오");
		
		int n = ten.nextInt();
		
		System.out.println("백의 자리수: "+n / 100);
		System.out.println("십의 자리수: "+n % 100 / 10);
		System.out.println("일의 자리수: "+n % 10);
		
	}
}
