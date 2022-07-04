// main class(public 붙임)
public class Example1 {
	// main class의 메서드는 모두 public static 붙임
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}
	
	public static void test1() {
		int a = 10; // 4byte 크기의 정수 메모리 공간 할당
		int b = 20;
		
		// sysout 치고 ctrl+space 누르면 자동완성
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		// 중간에 변수 선언이 가능
		double c = 3.14;
		System.out.println(a+c);
		
		// %d: 정수 포맷, %f: 실수 포맷, %c: 문자 
		System.out.printf("%d, %.3f\n",a, c);
	}
	
	public static void test2() {
		int number1 = 010; // 8진수 10
		int number2 = 0x10; // 16진수 10
			
		System.out.printf("number1 = %d\n", number1); // 10진수로 출력
		System.out.printf("number2 = %d\n", number2);
	}
	
	public static void test3() {
		int number1 = 8;
		int number2 = 16;
		System.out.printf("number1 = 0%o\n", number1); // 8진수로 출력
		System.out.printf("number2 = 0x%x\n", number2); // 16진수로 출력
	}
	
	public static void test4() {
		char blood = 'A'; // 1byte 문자
		System.out.println(blood + " type");
		
		boolean b = true; // or false(1byte)
		boolean c;
		c = 100 > 99; // true
		System.out.println(c);
		
		// other types..
		// byte: 1byte 정수
		// short: 2byte 정수
		double number = 3.145; // 8byte 실수
		System.out.println(number);
		System.out.printf("%f\n", number); // 기본 6자리까지
		System.out.printf("%.2f\n", number); // 반올림 해줌 
	}
	
	public static void test5() {
		// 문자열(사실 'String'이라는 데이터 타입은 없음. class임)
		String name = "Hong Gildong"; // String 클래스의 객체 name을 정의하여 문자열 지정
		System.out.println("Hi, " + name);
		System.out.printf("Bye, %s\n", name);
	}
}