import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	
	public static void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input age: ");
		
		int age = sc.nextInt();
		
		if(age >= 19) { // true
			System.out.println("adult!");
		}
		else {
			System.out.println("child!");
		}
	}

	
	public static void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input age: ");
		
		int age = sc.nextInt();
		
		if(age >= 19) {
			System.out.println("adult!");
		}
		else if(age >= 14){
			System.out.println("student!");
		}
		else if(age >= 8){
			System.out.println("child!");
		}
		else {
			System.out.println("baby!");
		}
	}
	
	public static void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number: ");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("even!");
		}
		else {
			System.out.println("odd!");
		}	
	}
	
	public static void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input hour: ");
		
		int hour = sc.nextInt();
		
		if(hour >= 0 && hour < 12)
			System.out.println("Good morning!");
		else if(hour >= 12 && hour < 18)
			System.out.println("Good afternoon!");
		else if(hour >= 18 && hour <= 24)
			System.out.println("Good evening!");
		else
			System.out.println("Wrong input!");
	}
}
