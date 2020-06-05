import java.util.Scanner;

// 1부터 10까지의 합 구하기
public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int n = scanner.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum +=i;
			i++;
			
		}
	
		System.out.printf("전체합:%d\n",sum);
	}
	
}
