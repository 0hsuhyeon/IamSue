package may_13;

import java.util.Scanner;

public class Ex04 {
	// 정수형 데이터 3개를 임의로 키보드로 입력받아서 최댓값을 조건연산자로 구현 
	public static void main(String[] args) {
		
		
		Scanner m = new Scanner(System.in);
		System.out.println("정수입력");
		
		int a = m.nextInt();
		int b = m.nextInt();
		int c = m.nextInt();
		int max;
		
		max = a<b? a:b;
		max = max>c? max:c;
		
	
		  /*int a = 30; 
		  int b = 50; 
		  int c = 25; 
		  int max;*/
		  
		  //조건식? True_value:False_value 
		  //max = (a>b>c)? a:b:c; 
		  max = (a>b)? a:b; 
		  max = (b>c)? b:c; 
		  max = (a>c)? a:c;
		 
		
		System.out.printf("최댓값:%d\n", max);
	}
}
