import java.util.Scanner;

public class Ex08 {


	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  int[] seats = new int[10];
	  
	  
	  while(true) {
	  
	  System.out.println("\n\t\t 현재 예약 상태");
		  seat(seats);
		  
	  System.out.print("\n좌석 선택>> ");
	  int n = s.nextInt();
	  
	  if(seats[n-1] == 0) {
	   seats[n-1] = 1;
	   System.out.println("\n예약 되었습니다.");
	   
	  }else {
	   System.out.println("\n이미 예약 되었습니다.");
	  }
	  
	  	seat(seats);
	  
	  s.nextLine();
	  System.out.print("\n계속 하시겠습니까(y/n)? ");
	  char ans =  s.nextLine().charAt(0);
	  
	  if(ans == 'n')
	   break;
	   
	  }
	  
	 }

	public static void seat(int b[])  {
		
	
		  System.out.println("--------------------------------------------");
		  
		  for (int i = 0; i < b.length; i++) {
		   System.out.printf("%4d", i+1);   
		  }
		  
		  System.out.println("\n--------------------------------------------");
		  
		  for (int i = 0; i < b.length; i++) {
		   System.out.printf("%4d", b[i]);
		   
		  }
	}

}