package june_08;

public class Ex03_PersonClassExample {
	
	public static void main(String[] args) {
		
		Person aPerson = new Person("홍길동");
		aPerson.age = 39;
		String yourName = aPerson.getName();
		
		System.out.println(aPerson.name + "나이는" + aPerson.age + "입니다");
		
	}

}
