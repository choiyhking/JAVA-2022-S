// 공통 클래스
// 추상 클래스는 공통적이고 형태만 정의 (기능이 없음)
// 하위 클래스의 구현을 위한 표준
abstract class Number {
	protected int number1, number2;
	
	// 하위 클래스에게 오버라이딩을 제공하기 위해서
	// 메서드를 형태만 정의하자 (abstract)
	// 추상 메서드 : 구현이 없는 형태만 갖춘 메서드
	abstract public int compute();
}

class Addnumber extends Number {	
	
	public Addnumber(int number1, int number2) {
		// TODO Auto-generated constructor stub
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 + number2;
	}
}

class Mulnumber extends Number {
	public Mulnumber(int number1, int number2) {
		// TODO Auto-generated constructor stub
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 * number2;
	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 업캐스팅
		Number ob1 = new Addnumber(10, 20);
		System.out.println(ob1.compute());
		
		Number ob2 = new Mulnumber(20, 30);
		System.out.println(ob2.compute());
	}
}
