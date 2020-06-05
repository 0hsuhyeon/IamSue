package may_20;

import java.util.Scanner;

public class Ex12 {
// 10개의 정수를 입력받아 최댓값과 최솟값을 구하시오
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n,min,max;
		
		System.out.println("정수를 입력하시오");
		min = max = n = s.nextInt();
		
			for(int i=1; i<11; i++) {
			
				System.out.println("정수를 입력하시오");
				n = s.nextInt();

				
				if(max<n)
					max = n;
				
				if(min>n)
					min = n;
			
			}
		
		System.out.printf("최댓값 %d, 최솟값%d",max,min);
		
		
	}
}
