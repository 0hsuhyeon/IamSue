package may_20;

import java.util.Scanner;

public class Ex06 {
//별 1개씩 입력해서 5개 1줄을 5줄 만들어라 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for(int j = 1; j<=5; j++) /*행을 제어*/{
			for(int i = 1; i<=5; i++)/*열을 제어*/
				System.out.print("*");
			
			System.out.println();
	
		}
	}
}
