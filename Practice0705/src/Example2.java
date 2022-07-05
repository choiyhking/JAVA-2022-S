// Car class
class Car {
	// 속성
	String name;
	String color;
	int engine; // 배기량
	
	// 메서드
	public void displayCar() {
		System.out.printf("Car name: %s\n", name);
		System.out.printf("Car color: %s\n", color);
		System.out.printf("Car engine: %dcc\n", engine);
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		Car myCar = new Car();
		// 속성 초기화
		myCar.name = "Sonata";
		myCar.color = "Black";
		myCar.engine = 3000;
		// 메서드로 정보 출력
		myCar.displayCar();
		
		System.out.println(); // 줄바꿈
		
		Car momCar = new Car();
		momCar.name = "Morning";
		momCar.color = "White";
		momCar.engine = 500;
		momCar.displayCar();
	}	

}
