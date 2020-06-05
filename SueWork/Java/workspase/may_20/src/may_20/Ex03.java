package may_20;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println("1. 파일열기");
			System.out.println("2. 파일저장");
			System.out.println("메뉴 선택");
			menu = s.nextInt();
		}while(menu<1|| menu>2);
	}
	
}
