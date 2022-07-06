import java.util.Scanner;

class Calculator {
	// 속성
	int menu;
	double n1, n2, result;
	
	// 메서드
	public void inputValue() {
		System.out.print("1. Add, 2. Sub, 3. Mul, 4. Div : ");
		
		Scanner sc = new Scanner(System.in);
		menu = sc.nextInt();
		
		if(menu >= 1 && menu <= 4) {
			System.out.print("First number: ");
			n1 = sc.nextInt();
			
			System.out.print("Second number: ");
			n2 = sc.nextInt();
			
		}
	}
	
	public void compute() {
		if(menu == 1) {
			result = n1 + n2;
		}
		else if(menu == 2) {
			result = n1 - n2;
		}
		else if(menu == 3) {
			result = n1 * n2;
		}
		else if(menu == 4) {
			result = n1 / n2;
		}
		else {
			result = -1;
		}
	}
	
	public void display() {
		System.out.println("Result = " + result);
	}
}

class Calculator2 {
	double n1, n2, result;
	
	public int inputValue() { // int형 menu를 반환
		System.out.print("1. Add, 2. Sub, 3. Mul, 4. Div : ");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt(); // 지역 변수(자신의 영역에서만 유효)
		
		if(menu >= 1 && menu <= 4) {
			System.out.print("First number: ");
			n1 = sc.nextInt();
			
			System.out.print("Second number: ");
			n2 = sc.nextInt();
			
		}
		
		return menu;
	}
	
	public void compute(int menu) {
		if(menu == 1) {
			result = n1 + n2;
		}
		else if(menu == 2) {
			result = n1 - n2;
		}
		else if(menu == 3) {
			result = n1 * n2;
		}
		else if(menu == 4) {
			result = n1 / n2;
		}
		else {
			result = -1;
		}
	}
	
	public void display() {
		System.out.println("Result = " + result);
	}
}

public class Example1 {

	public static void main(String[] args) { // static 붙은 메서드는 static 메서드만 호출 가능
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	
	public static void test1() {
		System.out.print("1. Add, 2. Sub, 3. Mul, 4. Div : ");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		System.out.print("First number: ");
		int n1 = sc.nextInt();
		
		System.out.print("Second number: ");
		int n2 = sc.nextInt();
		
		int result;
		
		if(menu == 1) {
			result = n1 + n2;
		}
		else if(menu == 2) {
			result = n1 - n2;
		}
		else if(menu == 3) {
			result = n1 * n2;
		}
		else if(menu == 4) {
			result = n1 / n2;
		}
		else {
			result = -1;
		}
		
		System.out.println("Result = " + result);
	}
	
	public static void test2() {
		// 객체 생성
		Calculator ob = new Calculator();
		ob.inputValue();
		ob.compute();
		ob.display();
	}
	
	public static void test3() {
		Calculator2 ob = new Calculator2();
		ob.compute(ob.inputValue());
		ob.display();
	}

}
