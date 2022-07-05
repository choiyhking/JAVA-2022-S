import java.util.Scanner; // ctrl+space로 import 해야할 것 확인

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	
	public static void test1() {
		int number1, number2;
		// 키보드로부터 값을 입력 받기(표준입력): System.in
		// Scanner class
		Scanner scanner = new Scanner(System.in);

		System.out.print("First number: ");
		number1 = scanner.nextInt(); // 정수 입력 메서드
		
		System.out.print("Second number: ");
		number2 = scanner.nextInt();
		
		System.out.println("Sum: " + (number1+number2));
	}
	
	public static void test2() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input1: ");
		double n1 = scanner.nextDouble(); // 실수 입력
		System.out.println(n1 + 12.4);
	}
	
	public static void test3() {
		Scanner scanner = new Scanner(System.in);
		
		//System.out.print("Name1: ");
		//String name1 = scanner.next(); // 문자열 입력(공백으로 구분)
		//System.out.println(name1);
		
		System.out.print("Name2: ");
		String name2 = scanner.nextLine(); // 한 줄 입력('\n'으로 구분)
		System.out.println(name2);
	}
	
}