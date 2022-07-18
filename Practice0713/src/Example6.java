import java.util.Scanner;

// 하위의 구현 클래스를 위한 표준을 제공 : interface 기능
// 객체를 생성하지는 못함
// 다형성을 위해 객체 참조변수로 정의할 수 있음
// 다형성: 하나의 객체가 여러 타입을 가질 수 있는 것
// 인터페이스를 참조하여 설계하는 클래스는 implements라는 키워드를 사용
// 인터페이스에서 정의한 메서드는 반드시 하위에서 오버라이딩 해야 함
// 인터페이스를 사용하여 다중상속을 구현할 수 있다
// 인터페이스: 극단적으로 동일한 목적 하에 동일한 기능을 보장하게 하기 위함
// 자바의 다형성을 이용하여 개발코드의 수정을 줄이고 유지보수성을 높인다

interface Num {
	int number = 0; 
	public int compute();
	public int korea(); // 짝퉁
}

// Num이라는 인터페이스를 구현하는 클래스
class Add implements Num {
	private int number1, number2;
	
	public Add(int number1, int number2) {
		// TODO Auto-generated constructor stub
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 + number2;
	}
	
	@Override
	public int korea() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Mul implements Num {
	private int number1, number2;
	
	public Mul(int number1, int number2) {
		// TODO Auto-generated constructor stub
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public int compute() {
		// TODO Auto-generated method stub
		return number1 * number2;
	}
	
	@Override
	public int korea() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.print("1.Add, 2.Mul : ");
		
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();	
		
		System.out.print("first number : ");
		int number1 = input.nextInt();
		
		System.out.print("second number : ");
		int number2 = input.nextInt();
		
		Num[] ob = new Num[2];
		ob[0] = new Add(number1, number2);
		ob[1] = new Mul(number1, number2);		
		System.out.println(ob[menu-1].compute());
	}
}
