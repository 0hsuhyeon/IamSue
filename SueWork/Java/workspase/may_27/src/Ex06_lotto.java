import java.util.Scanner;

public class Ex06_lotto {
// 1. 로또 번호 자동 생성
// 2. 로또 번호 입력
// 3. 당첨 확인
// 4. 종료
// 메뉴선택>> 
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int [] lottoNum = new int[7];
		
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum [i] = (int)(Math.random()*45);
			
			
		}
		
		
		
	}
}
