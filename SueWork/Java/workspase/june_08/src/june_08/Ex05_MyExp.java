package june_08;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Ex05_MyExp {
	
	
//	클래스 MyExp를 작성하라
//	MyExp는 지수값을 표현하는 클래스로서 두개의 정수형 멤버 필드 base와 exp를 가진다
//	
//	2의 3승의 경우 base는 2이며 exp는 3이다
//	base와 exp는 양의 정수만을 가지는 것으로 가정한다
//	
//	또한 MyExp는 정수값을 리턴하는 getValue()라는 메소드를 제공한다
//	
//	getValue()는 base와 exp값으로부터 지수를 계산하여 정수 값으로 리턴한다
	
	
	
	// 필드
	int base;
	int exp;
	
	
	// 생성자
	public Ex05_MyExp(int x, int y) {
		
		base = x;
		exp = y;
		
	}
	
	
	// 메소드 - 필드값을 이용해서 계산 
	public int getValue() {
		
		int value = 1;
		
		for (int i = 0; i < exp; i++) {
			value *= base;
		}
		
		return value ;
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("밑의 값은? ");
		int a = s.nextInt();
		
		System.out.println("지수의 값은? ");
		int b = s.nextInt();
		
		Ex05_MyExp ok = new Ex05_MyExp(a,b); // 생성자 호출
		
		System.out.println(ok.getValue()); // 계산메소드 출력
		
	}
	
	
	

}
