package may_20;

import java.util.Scanner;

// 음수 입력시 멈추는  시험 점수를 입력받아서 전체 합 구하기, 평균 구하기 
public class Ex02 {
	
	public static void main(String[] args) {
		Scanner gra = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		double avg;
		
		do {
			
			System.out.println("철학점수를 입력하시오");
			int gr = gra.nextInt();
			
			if(gr<0)
				break;
			
			sum += gr;
			i++;
			
			
		}while(true);
		
		avg = (double) sum/i;
		
		System.out.printf("철학점수 응시자는 %d명이며, 철학점수의 합은 %d 입니다\n",i, sum);
		System.out.printf("철학점수의 평균은 %.0f 입니다", avg);


	}
}