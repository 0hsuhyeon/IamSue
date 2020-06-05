package may_20;

import java.util.Scanner;

public class Ex10 {
// 사용자가 입력한 모든 정수 값들에 대해 1부터 그 정수까지의 누적 승을 출력하는 프로그램을 작성하시오
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		int num;
		char str;
	    int mul = 1;
		
		
			do {
				System.out.println("임의의 정수를 입력하시오");
				num = s.nextInt();
				//제곱근 식
				mul = 1;
				for (n = 1; n <= num; n++) {
					mul *= n;
					System.out.println(n + "\t" + mul);
				}
				System.out.println("계속 하시겠습니까? y/n");
				s.nextLine();//s.nextInt();의 숫자이외의 나머짓값을 버리는 역할
				str = s.nextLine().charAt(0);
				if (str == 'n')
					break;
			} while (true);
			
		
	}
}
