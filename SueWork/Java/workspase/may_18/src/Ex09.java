import java.util.Scanner;

// 철학과목의 중간고사 점수를 입력받습니다
// 학생의 인원은 모르고
// 철학과목의 전체 평균을 구하기 위한 합을 무한 루프 안에서 구하고
// 무한 루프 상태에서 나오기 위해 점수를 음수를 입력해서 반복문을 나온다

public class Ex09 {

	public static void main(String[] args)  {
		Scanner gr = new Scanner(System.in);
		
		int gra = 0;
		int g = 0;
		int i = 0;
		
		while(true) {
			System.out.println("철학 점수를 입력하십시오");
			gra = gr.nextInt();
			
			
			if(gra<0)
				break;
			i++; //  i = i+1; 
			g += gra;
		
			
		}
		
		System.out.printf("시험에 응시한 학생은 %d명이며 \n철학점수의 합은  %d 입니다\n",i, g);
		System.out.printf("철학점수의 평균은  %d 입니다", g/i);
	}
}
