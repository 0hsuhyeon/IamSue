package may_20;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		final int S = 1;
		final int R = 2;
		final int P = 3;
		String result ="";
		char en;
		
		do {
			
			
			int com = (int)((Math.random()*3)+1);
			System.out.printf("가위(1), 바위(2), 보(3) 중 하나를 입력하시오");
			int me = s.nextInt();
			
			if(me==S)
				if(com ==S)
					result ="무승부";
				else if(com ==R)
					result ="컴승";
				else
					result ="나의 승";
			else if(me==R)
				if(com ==S)
					result ="나의 승";
				else if(com ==R)
					result ="무승부";
				else
					result ="컴승";
			else if(me==P)
				if(com ==P)
					result ="무승부";
				else if(com ==S)
					result ="컴승";
				else
					result ="나의 승";
			
			System.out.printf("컴퓨터는 %s를 냈습니다.\n", com==1?"가위":com==2?"바위":"보");
			System.out.println("게임의 결과는" + result + "입니다.");
		
			System.out.printf("게임을 계속하시겠습니까? y/n\n");
			s.nextLine(); //엔터까지 버퍼
			en = s.nextLine().charAt(0);
			
			if(en == 'n') {
				System.out.println("게임을 종료하겠습니다");
				break;
			}
		}while(true);
	}
}
