class Person {
	String name;
	int age;
}

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	// 객체를 리턴하는 메서드
	public static Person makePerson() {
		Person man = new Person();
		man.name = "Hong";
		man.age = 23;
		
		return man;
	}
	
	// 객체를 전달받는 메서드
	public static String makeMessage(Person man) {
		String message = man.name + " is " + man.age;
		
		return message;
	}
	
	public static void test1() {
		Person ob = makePerson(); // Person ob = man;
		System.out.println(makeMessage(ob));
	}
	
	//------------------------------------------------------------
	//------------------------------------------------------------
	
	// 배열을 리턴하는 메서드
	// 배열도 객체다
	public static int[] makeScore() {
		int[] score = {100, 99, 98, 97};
		
		return score;
	}
	
	// 배열을 전달받는 메서드
	public static int getSum(int[] score) {
		int sum = 0;
		
		// enhanced for loop
		for(int n : score) {
			sum += n;
		}
		
		return sum;
	}
	
	public static void test2() {
		int[] s = makeScore();
		System.out.println(getSum(s));
	}

}
