
public class Ex01 {
	public static void main(String[] args) {
		
		int[] intArray = {10,20,30}; // 배열 선언
		// int[] intArray = new int[] {10,20,30];
		
		/*
		 * String[] intArray; // 배열 선언
		 * intArray = new String[5]; // 초기화되어 null값 5개가 저장된다
		 */		
		
		/*
		 * boolean[] intArray; // 배열 선언
		 * intArray = new boolean[5]; // 초기화되어 false값 5개가 저장된다
		 */
		
		/*
		 * int[] intArray; // 배열 선언
		 * intArray = new int[5]; // 초기화되어서 5개의 배열에 0이 저장되어 있다 
		 * 
		 * //?? 새로 new 선언할때 말고는 int[]안에 숫자를 넣을 일이 없는지 
		 * //A 그렇다. 
		 */
		
		
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
}
