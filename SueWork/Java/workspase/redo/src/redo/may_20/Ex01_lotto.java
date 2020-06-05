package redo.may_20;

public class Ex01_lotto {
//로또 추출 신준용 버전 
	public static void main(String[] args) {
		
	
	int[] lottoNum = new int[6]; 
		int lottoLength = 1;
		
		for (int i =0 ; i<6 ; i++) 
			lottoNum[i] = 0;
		
		while(lottoLength<6) {
			int temp = (int)(Math.random()*45+1);
			for(int k=0; k<lottoLength; k++) {
				if(temp == lottoNum[k])
					break;
				if(k==lottoLength-1){
					lottoNum[lottoLength-1]=temp;
					lottoLength++;
					break;
				}
			}
		}
		
		System.out.printf("%d,%d,%d,%d,%d,%d", lottoNum[0],lottoNum[1],lottoNum[2],lottoNum[3],lottoNum[4],lottoNum[5]);
	}
			
		
}
