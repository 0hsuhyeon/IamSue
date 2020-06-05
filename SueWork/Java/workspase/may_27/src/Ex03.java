import java.util.Scanner;

public class Ex03 {
// 정수형 데이터 5개를 키보드로 입력받아서 평균을 구하는 문제 (mey_25 Ex06과 동일)
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("%d번 점수:");
			score [i] = s.nextInt();
			sum += score[i];
			
			System.out.printf("전체 평균 점수:%.2f\n",(double)sum/score.length);
			
		}
		
	}
}
