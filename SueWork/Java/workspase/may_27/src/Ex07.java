import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 예약상태
		Scanner s = new Scanner(System.in);
		
		int [] ch = new int[10];
		int re = 0;
		
		do {
			System.out.println("현재의 예약상태");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			
			for (int i = 0; i < ch.length; i++) {
				
				System.out.print(ch[i]+" ");
				
			}
			
			System.out.println("\n좌석 선택(1~10) ::");
			re = s.nextInt(); 
			
				if(!(re>0 && re<11)) {
					System.out.println("올바르지 않은 접근입니다");
					continue;
				}
				else if(ch[re-1]==1)
					System.out.println("이미 예약된 좌석입니다");
				else {
					ch[re-1] = 1;
					System.out.println("예약되었습니다");
				}
			gg:
			do {
			System.out.println("계속하시겠습니까? y/n");
			s.nextLine();
			//String a = s.nextLine();
			char a = s.nextLine().charAt(0);
			
					switch (a) {
					case 'y':
						System.out.println("계속합니다");
						break gg;
					case 'n':
						System.out.println("중지합니다");		
						return;
					default:System.out.println("올바르지 않은 값입니다");
						break;
		
					}
			}while(true);
		}while(true);
	
	}
	
}
