import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//난수 5개를 입력해서 최댓값구하기
		
		Scanner s = new Scanner(System.in);
		int [] num = new int[5];
		int max =num[0];
	
		for (int i = 0; i < num.length; i++) {
			num [i] = (int)(Math.random()*101);
		}
		
		for (int i = 0; i < num.length-1; i++) {
			int m= i;
			
//			for (int j = 0; j < num.length -1; j++) {
//			if(max<num[i])
//				max = num[i];
//			
//			}// 최댓값구하기
			
			for (int j = i+1; j < num.length; j++) {
				if(num[m]>num[j])
					m=j;
			}
			
			
			int tmp = num[i];
			num[i] = num[m];
			num[m] = tmp;
		}

		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j] + " "); //배열출력
			
		}
//		for (i = 0; i < num.length; i++) {
//			System.out.print(num [i] + " "); 
//		} //배열 출력

//		System.out.printf("\n최댓값 :  %d",max); // 최댓값 출력
	

	}

}
