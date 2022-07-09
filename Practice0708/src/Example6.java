class Data {
	int number = 10;
	
	public void increment() {
		number++;
	}
}

class Value {
	static int number1 = 10; // static을 붙이면 number1은 '클래스 변수'(클래스의 '모든 객체가 공유'하는 변수가 된다)
	int number2 = 20; // 일반 속성 변수(객체마다 각각의 메모리를 할당 받음)

	public static void add() { // '클래스 메서드'
		number1 += 2;
		// number2 += 3; (X) => number2는 객체마다 각각 가지는 변수이므로 불가능
		// 결국 static은 static만 호출 가능
		// test() 호출 불가능 => static method는 static만 호출
	}
	
	public void test() {
		// codes...
		add(); // 이거는 가능함
	}
}

class Sample {
	static int a;
	
	public static void display() {
		System.out.println("hello " + a);
	}
}

// Example6.main()으로 호출하면 됨
// 자동으로 실행(ctrl + f11)
// filename.main()
public class Example6 { 
	// 속성(=클래스의 전역변수 느낌)
	int number3 = 30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}
	
	public static void test1() {
		// 지역 변수: 지역에서 선언 한 변수(메서드 안에서) -> 그 영역 안에서만 유효
		// 전역 변수: 메서드의 밖에서 정의한 변수
		int number1 = 10;
	}
	
	public static void test2() {
		// 객체 변수(객체 참조 변수)
		int n1 = 10;
		int n2 = n1; // shallow copy
		n2++;
		System.out.println(n2); // 11
		System.out.println(n1); // 10
	}
	
	public static void test3() {
		Data ob1 = new Data();
		Data ob2 = ob1; // ob1, ob2는 참조변수이므로 '참조값'을 가짐 -> deep copy -> 같은 객체를 가리킴
		
		ob2.number++;
		System.out.println(ob2.number); // 11
		System.out.println(ob1.number); // 11
		
		Data ob3 = new Data();
		ob3.increment();
		System.out.println(ob3.number);
		
		ob1.increment();
		System.out.println(ob2.number);
	}
	
	public static void test4() {
		Value ob1 = new Value();
		ob1.number1++;
		ob1.number2++;
		System.out.println(ob1.number1); // 11
		System.out.println(ob1.number2); // 21
		
		Value ob2 = new Value();
		ob2.number1++;
		ob2.number2++;
		System.out.println(ob2.number1); // 12
		System.out.println(ob2.number2); // 21
		
		// 클래스 변수: 같은 클래스로 만들어진 모든 객체가 공유하는 변수
		// 클래스의 속성에 static을 붙임
		// 그렇다면 굳이 객체를 만들지 않더라도 접근할 수 있나? Yes => 클래스의 이름으로 접근!
		// System, Arrays 클래스도 동일한 원리
		System.out.println(Value.number1);
		Value.number1++;
		System.out.println(ob1.number1); // 13
		System.out.println(ob2.number1); // 13
		
		// ob1.add();도 가능
		Value.add();
	}
	
	public static void test5() {
		Sample.a = 100;
		Sample.display();
		
		//Sample ob = new Sample();
		//ob.display();
	}

}
