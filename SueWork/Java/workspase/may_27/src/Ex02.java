
public class Ex02 {
	
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "임꺽정";
		String str3 = new String ("임꺽정");
		String str4 = "임꺽정";
		
		// ?? 왜 String Scanner 둘 다 클래스인데 하나는 import 를 넣어야하는지
		// A 둘은 클래스 유형이 달라서 그렇다. String은 객체 생성 클래스 

		if(str1 == str2)
			System.out.println("일치");
		else
			System.out.println("불일치");
		
		if(str3 == str4)
			System.out.println("일치");
		else
			System.out.println("불일치");
		
		////////////.equals(문자열 비교)///////////////
		if(str1.equals(str2))
			System.out.println("일치");
		else
			System.out.println("불일치");
		
	}

}
