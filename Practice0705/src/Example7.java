import java.util.Scanner;

class Person {
	String name;
	int age;
	char blood;
	double weight;
	
	public void display() {
		System.out.printf("Name: %s\n", name);
		System.out.printf("Age: %d\n", age);
		System.out.printf("Blood: %c\n", blood);
		System.out.printf("Weight: %.1f\n", weight);
	}
}

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person man = new Person();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input the name: ");
		man.name = scanner.nextLine();
		
		System.out.print("Input the age: ");
		man.age = scanner.nextInt();
		
		// 문자 입력(Scanner 클래스에 문자 1개 입력받는 메서드는 없음 -> 문자열에서 첫번째 문자를 가져오는 방법 사용: charAt())
		System.out.print("Input the blood: ");
		man.blood = scanner.next().charAt(0); // 문자열에서 특정 인덱스의 문자 가져오기
		
		System.out.print("Input the weight: ");
		man.weight = scanner.nextDouble();
		
		man.display();
		
		// Integer a = 10; // a는 객체
		// final int b = 10 // =const(상수화)
	}
}
