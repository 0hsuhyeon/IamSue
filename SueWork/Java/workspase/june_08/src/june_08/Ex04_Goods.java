package june_08;

public class Ex04_Goods {

//	상품 하나를 표현하는 클래스 Goods를 작성하라
//	
//	상품은 String 타입의 name 
//	int 타입의 price. numberOfStock. sold 등 네개의 필드를 갖는다
//	
//	Goods 클래스 내에 main() 메소드를 작성하여 Goods 객체를 생성하고 
//	이 객체에 대한 참조 변수 명을 camera로 하라
//	
	
	String name;
	int price;
	int numberOfStock;
	int sold;

	
	public Ex04_Goods(String name2, int price2, int n, int sold2) {
		name = name2;
		price = price2;
		numberOfStock = n;
		sold = sold2;
		
	}
	
	public int getPrice() {
		return price;
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
	public int getSold() {
		return sold;
	}
	public String getName() {
		return name;
	}
	



	
}
