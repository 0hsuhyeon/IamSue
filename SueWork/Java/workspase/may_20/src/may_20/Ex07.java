package may_20;

import java.util.Scanner;

public class Ex07 {
//2차원 배열
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for(int j = 1; j<=5; j++) /*행을 제어*/{
			for(int i = 1; i<=5; i++)/*열을 제어*/
				System.out.printf("(%d, %d)\n",j,i);
			
			System.out.println();
	
		}
	}
}
