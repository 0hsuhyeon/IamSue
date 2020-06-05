import java.util.Scanner;

// 그림 1(약수출력, 소수 판단)과 같이 실행되는 프로그램을 설계하시오
public class Ex04 {

	   public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);

	      while (true) {
	         MENU();
	         int n = sc.nextInt();

	         if(n == 3) {
	            System.out.println("종료합니다.");
	            return;
	         }

	         if(!(n>=1 && n<=3)) {
	            System.out.println("잘못된 입력입니다.");
	            continue;
	         }

	         System.out.println("임의의 정수 : ");
	         int m = sc.nextInt();

	         switch(n) {
	         case 1: div(m); break;
	         case 2: prime(m); break;
	         }
	      }
	   }

	   ////////////////////////////////////////////////////////////////////
	   public static void div(int x) {
	      for(int i=1; i<=x; i++) {
	         if(x % i == 0) {
	            System.out.printf("%4d", i);
	         }
	      }
	   }

	   ////////////////////////////////////////////////////////////////////
	   public static void prime(int x) {
	      int i;
	      for(i=2; i<x; i++) {
	         if(x % i ==0) {
	            break;
	         }
	      }
	      if(i == x) {
	         System.out.printf("%d는 소수입니다.\n", x);
	      } else {
	         System.out.printf("%d는 소수가 아닙니다.\n", x);
	      }
	   }   

	   /*int count = 0;
	      for(int i=1; i<=x; i++) {
	         if(x % i == 0) {
	            count++;
	         }
	      }
	      if(count == 2) {
	         System.out.printf("%d는 소수입니다.\n", x);
	      } else {
	         System.out.printf("%d는 소수가 아닙니다.\n", x);
	      }*/

	   ////////////////////////////////////////////////////////////////////
	   public static void MENU() {
	      System.out.println(">> MENU");
	      System.out.print("(1) 약수 출력   ");
	      System.out.print("(2) 소수 판단   ");
	      System.out.print("(3) 종료   ");
	      System.out.print("   [메뉴 선택] : ");
	   }
	}