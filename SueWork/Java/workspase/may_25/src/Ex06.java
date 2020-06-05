import java.util.Scanner;

public class Ex06 {
// 스코어 배열을 만들어서 어떤 과목의 중간고사 점수 5개를 입력받아서 그 과목의 평균점수를 입력받는다
	
	 public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		 int[] score = new int[5];
		 int sum = 0;
		 
		 for (int i = 0; i < score.length; i++) {
			 System.out.println("점수 입력하세요");
			 score[i] = s.nextInt();
			 sum += score[i];
		}
		 double avg =(double)sum/score.length;
		 
		 System.out.printf("전체 평균 점수 %.f\n", avg);
	}
}
