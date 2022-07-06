import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	
	public static void test1() {
		int number = 1;
		
		switch(number) { // 정수 값을 판단하여 맞는 case로 분기
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			default:
				System.out.println("other");
		}
	}
	
	public static void test2() {
		String city = "seoul";
		
		switch(city) { // C와 달리 '문자열'로도 분기 가능
			case "seoul":
				System.out.println("seoul");
				break;
			case "daegu":
				System.out.println("daegu");
				break;
			case "busan":
				System.out.println("busan");
				break;
			case "incheon":
				System.out.println("incheon");
				break;
			default:
				System.out.println("other");
		}
	}
	
	public static void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input: ");
		char letter = sc.next().charAt(0);
		
		switch(letter) { // 문자(char)는 결국 정수이므로 당연히 가능
			case 'M': // 규칙 없는 2개의 조건이 같은 명령을 수행할 때, break 없이 사용
			case 'x':
				System.out.println("Morning");
				break;
			case 'A':
			case 'w':
				System.out.println("Afternoon");
				break;
			case 'E':
			case 'u':
				System.out.println("Evening");
				break;
			default:
				System.out.println("other");
		}
	}

}
