import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 사용자로부터 1부터 50사이의 숫자 10개를 입력받아서 숫자만큼의 별표를 출력하는 프로그램을 작성
		
		Scanner s = new Scanner(System.in);
		boolean t = true;
		int j = 1;
		
		
		do {
			System.out.printf("\n막대 %d의 길이:", j);
			int num = s.nextInt();
			
			if (num<51 && num>0) {
				j++;
				for (int i = 0; i < num ; i++) {
					System.out.print("#");
				}
			
			}else
				System.out.println("\n허용되지 않는 길이입니다.\n다시 입력하세요!\n");
			
		}while(j<11);
			System.out.println("\n시스템을 종료합니다.");
	}
}
