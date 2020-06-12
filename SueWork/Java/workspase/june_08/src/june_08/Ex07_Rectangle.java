package june_08;

import java.util.Scanner;

public class Ex07_Rectangle {
	
//	너비와 높이를 입력받아 사각형의 면적을 출력하는 프로그램을 작성하라
//	int 형 너비(width)와 높이(height)필드, 그리고 면적값을 제공하는 getArea() 메소드를 가진 Rectangle 클래스를 만들어 활용하라

	int width;
	int height;
	

	public Ex07_Rectangle(int x, int y) {
		width = x;
		height = y;
	}
	
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("넓이의 값은? ");
		int a = s.nextInt();
		
		System.out.println("높이의 값은? ");
		int b = s.nextInt();
		
		
		Ex07_Rectangle wh = new Ex07_Rectangle(a,b);
		System.out.println("면적의 값: " + wh.getArea());
	}

}
