package edu.java.inheritance03;

public class InheritanceMain03 {

	public static void main(String[] args) {
		// 메서드 override 
		
		// Car 클래스의 인스턴스를 생성
		Car car1 = new Car(50);
		car1.drive();

		// ElectricCar 클래스의 인스턴스를 생성
		ElectricCar car2 = new ElectricCar(50, 100);
		car2.drive();
		
	}

}
