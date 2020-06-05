package may_20;

import java.util.Scanner;

public class Ex08 {
//별만들기 2
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for(int j = 1; j<=5; j++) /*행을 제어*/{
			for(int i = 1 ; i<=j; i++)/*열을 제어*/
				System.out.print("*");
			
			System.out.println();
	
		}
	}
}
