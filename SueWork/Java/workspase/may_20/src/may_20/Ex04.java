package may_20;
// 달을 입력받아서 달이 며칠까지 있는지 출력
// 입력받은 달이 입력범위에 없을때 다시 입력 안내를 하고 반복

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int month;
		int days;
		
		do {
			System.out.println("원하는 달을 입력하세요>> ");
			month = s.nextInt();
				
				if(month>12 || month<=0) {
					System.out.println("유효하지 않은 달입니다.");
			
				}
				
				switch (month) {
				case 2: 
					days = 28;
					break;
				case 4: case 6: case 9: case 11:
					days = 30;
					break;
				default:
					days = 31;
				}
		}while(month>12 || month<=0);
		
		System.out.printf("입력한 %d월은 %d일까지 있습니다. \n", month, days);
	}
}
