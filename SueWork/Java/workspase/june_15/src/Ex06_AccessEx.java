

class Sample{
	public int a;
	private int b; // private로 사용시 다른 클래스에서 사용 불가능
//	int b;
	int c;


public void setB(int b) {
	this.b = b;
}

public int getB() {
	return b;
}
}
public class Ex06_AccessEx{
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a=10;
		aClass.setB(10);
//		aClaas.b=10;
		aClass.c=10;
		int x = aClass.getB();
	}
	
}