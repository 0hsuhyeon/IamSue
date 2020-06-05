import java.util.Scanner;

// While문을 이용하여 Hello라는 단어를 창에 5번 나오게 만들라 
public class Ex07 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int i = 1;
			
			/*
			while(i<=5) {
				System.out.println("Hell");
				i++;
			}
			*/
			
			//구구단
			System.out.println("보고싶은 구구단 숫자를 적으시오");
			int n = sc.nextInt();
			
			while(i<=9) {
				System.out.printf("%d * %d = %d\n", n,i,n*i);
				i++;
			}
			
		}
}
