// 'Car' has a 'Wheel'

// 소유의 관계로 설계해보자
/*class Wheel {
	public int inch;
	
	public void setWheel(int inch) {
		this.inch = inch;
	}
}

class Car {
	public Wheel wheel; // 객체를 소유
	public int year;
	
	public void setCar(Wheel wheel, int year) {
		this.wheel = wheel;
		this.year = year;
	}
	
	public void displayCar() {
		System.out.println("Wheel: " + wheel.inch);
		System.out.println("Year: " + this.year);
	}
}

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		
		Wheel mywh = new Wheel();
		mywh.setWheel(10);
		mycar.setCar(mywh, 2010);
		mycar.displayCar();
	}

}*/


// 상속관계 사용
class Wheel {
	public int inch;
	
	public void setWheel(int inch) {
		this.inch = inch;
	}
}

class Car extends Wheel {
	public int year;
	
	public void setCar(int wh, int year) {
		// super 키워드: 부모의 것을 의미(구분)
		super.setWheel(wh); 
		this.year = year;
	}
	
	public void displayCar() {
		System.out.println("Wheel: " + super.inch);
		System.out.println("Year: " + this.year);
	}
}

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		
		mycar.setCar(10, 2010);
		mycar.displayCar();
	}

}
