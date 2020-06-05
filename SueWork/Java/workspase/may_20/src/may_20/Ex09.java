package may_20;

import java.util.Scanner;

// 임의의 양의 정수를 반복 입력받아 그 중에 전체 짝수의 개수를 출력하는 프로그램을 작성하시오 (나가기: 음수입력)
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int num; 
		int i = 0;
		int j = 0;
	
		
		
		do {
			System.out.println("임의의 양의 정수를 입력하시오(나가기: 음수입력)");
			num = s.nextInt();
			
			
			if(num<0)
				break;
			
			if(num%2==0)
				j++;
			
			i++;
		
		}while(true);
		
		System.out.printf("입력한 숫자는 %d개이며 그중 짝수는 %d개이다",i, j);
	}
}
