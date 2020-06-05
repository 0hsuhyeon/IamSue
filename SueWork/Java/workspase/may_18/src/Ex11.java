// for문으로 구구단 출력하기
public class Ex11 {

	public static void main(String[] args) {
		
		for(int m=1; m<=9; m++) {
			
			System.out.println(m+"단");
			for(int n=1; n<=9; n++)
				
			System.out.printf("%d * %d = %d\n",m,n,m*n );
				
		}
	}
}
