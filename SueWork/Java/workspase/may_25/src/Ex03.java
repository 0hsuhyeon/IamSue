import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int result = 0;
		boolean flag = true;
		
		while(flag) {
			menu();
			System.out.println("\n메뉴선택>>");
			int n = s.nextInt();
			
				if(n == 5) {
					System.out.println("프로그램 종료");
					return;
				}
				if(n > 6 || n<0 ) {
					System.out.println("유효하지 않은 값입니다. 다시 입력해주세요");
					continue;
				}
	
			System.out.println("\n정수 1 입력>>");
			int x = s.nextInt();
			
			System.out.println("\n정수 2 입력>>");
			int y = s.nextInt();
			
				switch (n) {
				case 1:
					result = add(x,y);
					break;
				case 2:
					result = sub(x,y);
					break;
				case 3:
					result = mul(x,y);
					break;
				case 4:
					result = div(x,y);
					break;
				
			}
			
			System.out.printf("계산결과:%d\n", result);
		}
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int add(int x, int y){
		return x + y;
		
	}	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int sub(int x, int y){
	return x - y;
	
	}		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int mul(int x, int y){
	return x * y;
	
	}		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int div(int x, int y){
	return x / y;
	
	}	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void menu() {
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 나눗셈");
		System.out.println("4. 곱셈");
		System.out.println("5. 종료");
		
	}		
}
