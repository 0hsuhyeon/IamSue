package may_13;
// 입력받은 하나의 문자가 알파벳 대문자이면 1을 아니면 0을 출력하는 프로그램을 작성하시오 (아스키코드 사용)

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		System.out.println("알파벳 입력하시오");
		char ch = n.nextLine().charAt(0);
		
		if(ch >='A'&& ch<='Z') {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}

}
