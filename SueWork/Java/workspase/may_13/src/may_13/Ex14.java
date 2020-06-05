package may_13;

import java.util.Scanner;

public class Ex14 {

	// 스코어점수를 입력해서 그 점수가 100~ 90 에이 80 라인이면 B
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("점수 입력");
			int score = scan.nextInt();
			char grd;
			
			if(score >=90)
				grd = 'A';
			else if(score >=80)	
				grd = 'B';
			else if (score >=70)	
				grd = 'D';
			else if (score >=60 && score < 70)	
				grd = 'D';
			else
				grd = 'F';
			
			System.out.printf("당신의 학점은 %c입니다\n", grd);
		}
}
