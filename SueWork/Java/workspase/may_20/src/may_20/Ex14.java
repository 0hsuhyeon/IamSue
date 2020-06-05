package may_20;

public class Ex14 {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		go: //레이블 이름 
			
		for(int i =1; i<=3; i++) {
			cnt++;
			System.out.printf("\n[%d행]\n",i);
			
			for(int j=1; j<=3; j++) {
				System.out.println("안에서 뱅글뱅글~");
				
				if(cnt == 2)
					break go;
			}
			System.out.println("\n밖에서 뱅글뱅글~");
		}
		
		
	}
}
