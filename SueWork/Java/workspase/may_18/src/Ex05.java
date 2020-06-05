import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요>> ");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요>> ");
		int month = sc.nextInt();
		
		int days;
		
	
		
		switch (month) {
		case 2: 
			
			//윤년 구분
			days = ((year%4 == 0) && (year%100 !=0) || (year%400==0))? 29 : 28 ;
			break;
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		default:
			days = 31;
		}
		
		System.out.printf("입력한 %d월은 %d일까지 있습니다. \n", month, days);
	}
}
