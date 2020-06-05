package redo.may_20;

import java.util.Scanner;

//게임 종료후에도 게임이 계속될지 묻기
public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		String en;
		
		do {
			System.out.printf("가위(1), 바위(2), 보(3) 중 하나를 입력하시오");
			int me = s.nextInt();
			
			System.out.printf("게임을 계속하시겠습니까? y/n\n");
			
			en = s.nextLine();
			
			if(en == "n") {
				System.out.println("게임을 종료하겠습니다");
				break;
			}	
		}while(true);
		
	}
}
