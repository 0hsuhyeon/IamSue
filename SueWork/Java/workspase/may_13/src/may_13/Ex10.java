package may_13;

import java.util.Scanner;

public class Ex10 {
 // 당신의 국적은(Korea(1)/Etc(2))?
 // 당신의 성별은 (Male(3)/Female(4))?
 // 당신은 한국 여성입니다
	
	public static void main(String[] args) {
		Scanner iden = new Scanner(System.in);
		
		final int KOR = 1;
		final int ETC = 2;
		final int MALE = 3;
		final int FEMALE = 4;
		
		
		System.out.println("당신의 국적은? Korea(1)/Etc(2)");
		int c = iden.nextInt();
		
		System.out.println("당신의 성별은? Male(3)/Female(4)");
		int m = iden.nextInt();
		
		if(c==1 && m==4) 
			System.out.println("당신은 한국 여성입니다");
		else 
			System.out.println("당신은 한국 여성이 아닙니다");
		
			
	}
}
