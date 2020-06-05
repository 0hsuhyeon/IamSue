package may_20;

import java.util.Scanner;

// 숫자로 배열 만들기 
public class Ex11 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		int num = s.nextInt();
		
		for(int j = 1; j<=num; j++) /*행을 제어*/{
			for(int i = 1 ; i<=j; i++)/*열을 제어*/
				System.out.print(i);
			
			System.out.println();
		}
		
	}
}
