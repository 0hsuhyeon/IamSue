package may_13;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 사용자로부터 물리, 역사, 철학점수를 입력받아 세 점수가 70점 이상이면 '통과' 그렇지 않으면 '다음기회에'라는 문자열이 출력되는 프로그램을 작성하시오 
		// 단. 조건 연산자를 이용하여 구한다
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물리점수를 입력하시오");
		int p = sc.nextInt();
		System.out.println("역사점수를 입력하시오");
		int h = sc.nextInt();
		System.out.println("철학점수를 입력하시오");
		int s = sc.nextInt();

		// 조건식? True_value:False_value
		
		//String str;
		//str = p<=70 && h<=70 && s<=70? "통과":"다음 기회에";
		//System.out.println(str);

		System.out.println(p<=70 && h<=70 && s<=70? "통과":"다음 기회에");
		
	
	}

}
