package may_13;

import java.io.IOException;
import java.util.Scanner;

public class Ex12 {

	// 키와 몸무게를 입력받아 정상인지 비만인지 출력하는 프로그램을 작성하시오
	// 키에 따른 표준 체중을 구하는 방법은 신장(키)에서 100을 빼고 그 값에 0.9를 구하여 표준체중을 구하면 된다
	
		public static void main(String[] args) throws IOException {
			
			Scanner n = new Scanner(System.in);
			
			System.out.println("키를 입력하시오");
			int h = n.nextInt();
			System.out.println("체중을 입력하시오");
			int w = n.nextInt();
			
			if((h-100)*0.9 < w)
				System.out.println("비만");
			else
				System.out.println("비만이 아님");
			
		}
}
