package may_13;

import java.util.Scanner;

//논리연산자 - 윤년을 활용한 예제
public class Ex02 {
	public static void main(String[] args) {
		
		Scanner yun = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = yun.nextInt();
		
		boolean bool;
		
		bool = (year%4 == 0) && (year%100 !=0) || (year%400==0) ;
		System.out.println("결과:" + bool);
		
	}
}
