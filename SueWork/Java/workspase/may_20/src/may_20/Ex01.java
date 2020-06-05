package may_20;

public class Ex01 {
//1부터 10까지의 합
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		do {
			sum = sum + i;
			i++;
		}while(i<=10);
		
		System.out.printf("1부터 10까지의 합은 %d 입니다", sum);

		/*
		 * Hello 5번 출력하기
		 * 
		 * int i = 1;
		 * 
		 * do{
		 * 	System.out.println("Hello");
		 * 	i++;
		 * }while(i<=5);
		 * 
		 */
		
	}
}
