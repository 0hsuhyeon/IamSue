import java.util.Scanner;

//근로 소득세를 계산하는 프로그램을 작성하여 보자. 근로 소득세율은 다음과 같다. 사용자가 자신의 과세 표준 금액을 입력하면 근로 소득세를 계산하여 주는 프로그램을 작성
// 과세표준					세율
//1000만원 이하					8퍼
//1000만원 초과 4000만원 이하		17퍼
//4000만원 초과 8000만원 이하		26퍼
//8000만원 초과					35퍼

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과세 표준: ");
		int m = sc.nextInt();
		
		/*
		int n = m/100;
		
		System.out.println("소득세는 다음과 같습니다");
		if(m<=1000) {
			System.out.println(n*8);
		}else if(1000<m && m<=4000) {
			System.out.println(n*17);
		}else if(4000<m && m<=8000) {
			System.out.println(n*26);
		}else if(8000<m) {
			System.out.println(n*35);
		}
		*/
		
		double tax;
		if(m<=1000) 
			tax = m*0.08;
		else if(m<=4000)
			tax = m*0.17;
		else if(m<=8000)
			tax = m*0.29;
		else
			tax = m*0.35;
			
			System.out.printf("소득세는 %.0f\n원 입니다", tax);
	}
}
