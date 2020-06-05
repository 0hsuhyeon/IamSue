import java.util.Scanner;

// 음수를 입력하면 구구단이 멈추는 구조 
public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		for( ;; ) {
			
			System.out.println("원하는 단");
			int m = sc.nextInt();
			
			if(m<0) {
				System.out.println(" 종료합니다. ");
				break;
			}
			
			System.out.println(m+"단");
			
			for(int n=1; n<=9; n++)
			System.out.printf("%d * %d = %d\n",m,n,m*n );
		}
		
	}
}
