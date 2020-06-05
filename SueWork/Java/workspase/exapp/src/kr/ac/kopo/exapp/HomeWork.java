package kr.ac.kopo.exapp;

import java.util.ArrayList;
import java.util.Scanner;
//"1.목록 2.추가 3.삭제 4.종료" 라고 메뉴를 출력
//번호를 입력받는다
//"1"을 입력한 경우, 현재까지 입력한 값들을 모두 출력
//"2"을 입력한 경우, "좋아하는 음식을 입력하세요"라고 출력하고,
//음식 이름을 입력 받아서 리스트에 저장
//"3"을 입력한 경우, "삭제할 음식의 번호를 입력하세요"라고 출력하고,
//입력한 번호의 음식을 리스트에서 삭제
//"4"을 입력한 경우, 프로그램을 종료
   
//위 작업을 무한 반복
public class HomeWork {
	public static void main(String[] args) {
		
		
		//		리스트 생성
		//		string을 여러개 저장할 수 있는 리스트를 생성하여
		//		list라는 변수에 저장
		//		ArrayList<String> list = new ArrayList<String>();
		//		list.add("피자"); //list 라는 목록에 "피자"를 저장(추가)
		//		list.add("햄버거"); //list 라는 목록에 "햄버거"를 저장(추가)
		//		
		//		System.out.println("리스트에 저장된 문자열의 갯수 :" + list.size());
		//		System.out.println(list.get(0)); //리스트에 저장되어있는 0번 값을 불러오기
		//		System.out.println(list.get(1)); //리스트에 저장되어있는 1번 값을 불러오기
			ArrayList<String> list = new ArrayList<String>();
			
			Scanner s = new Scanner(System.in);
			boolean flag = true; // While 값  ( flag 입력 후 ctrl +1로 추가)
			String food="";
			
			do{
				System.out.printf("1. 목록	2. 추가	3. 삭제	4. 종료");
				
				char num1 = s.nextLine().charAt(0);
			
				switch (num1) {
					case '1': 
						System.out.printf("현재까지 입력한 값은 다음과 같습니다\n");
						for(int i=0; i<list.size(); i++) {
						System.out.println(i +". "+list.get(i));
						}
						break;
						
					case '2': 
						System.out.printf("좋아하는 음식을 입력하세요\n"); //add ?
						food = s.nextLine();
						list.add(food);
						break;
						
					case '3': 
						System.out.printf("삭제할 음식의 번호를 입력하세요\n"); //remove ?
						String num = s.nextLine();
						int n = Integer.parseInt(num);
						list.remove(n);
						break;
						
					case '4':
						System.out.printf("프로그램을 종료합니다\n"); 
						flag = false;
						//return //밑에 실행문 실행하지 않고 돌아가는 명령
						//System.exit(0); // 프로그램을 아예 끝내는 명령
						break;
						
					default:System.out.printf("정상입력 ㄴㄴ 다시 입력 ㄱㄱ\n");
						break;
					}
			}while(flag);
	}
}
