package june_08;

public class Ex06_Circle {

	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드
	
	public Ex06_Circle() {} // 원의 생성자 -> 생략가능 : 컴파일 과정에 자동으로 기본생성자를 만든다. 사용자가 임의로 생성자를 만들어놓은게 있으면 생성안됨 
	
	public double getArea() { // 원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		
		Ex06_Circle pizza;
		pizza = new Ex06_Circle(); // Circle객체 생성
		
		pizza.radius = 10; // 피자의 반지름을 10으로 설정
		pizza.name = "자바피자"; // 피자의 이름 설정
		double area = pizza.getArea(); // 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은" + area);
		
		Ex06_Circle donut = new Ex06_Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name +"의 면적은" + area);
		
	}
	
	
}
