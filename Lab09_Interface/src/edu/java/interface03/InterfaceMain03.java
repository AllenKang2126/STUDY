package edu.java.interface03;

public class InterfaceMain03 {

	public static void main(String[] args) {
		// Customer 인스턴스 생성
		Customer customer1 = new Customer();
		customer1.buy();
		customer1.sell();
		
		System.out.println();
		Buyer customer2 = new Customer();  // 다형성(polymorphism)
		customer2.buy();
		// 생성된 인스턴스는 Customer 타입이지만 참조 변수 선언을 Buyer로 했기 때문에, Buyer 인터페이스의 메서드만 보임.
		// 강제 타입 변환(casting)을 사용하면 Seller 인터페이스의 메서드도 사용 가능.
		if(customer2 instanceof Customer) {
			((Customer) customer2).sell();
		}

	}

}  // end class InterfaceMain03


// 상위 클래스 상속(extends)과 인터페이스 구현(implements)를 동시에 하는 경우 :
class SuperClass {}
interface MyInterface {}
class SubClass extends SuperClass implements MyInterface{}

// 2개 이상의 인터페이스를 구현하는 경우:
interface Buyer{
	void buy();
}  // end interface Buyer

interface Seller {
	void sell();
}  // end interface Seller

class Customer implements Buyer, Seller {
	
	@Override  // Seller 인터페이스의 추상 메서드를 구현
	public void sell() {
		System.out.println("판매...");
	}
	
	@Override  // Buyer 인터페이스의 추상 메서드를 구현
	public void buy() {
		System.out.println("구매...");
	}
	
}