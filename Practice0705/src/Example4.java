// 한 프로젝트 내에 동일한 이름의 class는 불가함
class Test {
	String name;
	double average;
	
	// 매개변수를 사용하여 점수를 전달
	public void calAverage(int theory, int practice) {
		int total = theory + practice; // total은 class의 속성 아님
		average = total / 2;
	}
	
	public void display() {
		System.out.printf("Name: %s\n", name);
		System.out.printf("Average: %.1f", average);
	}
}

// 변형1
class Test1 {
	String name;
	double average;
	
	// 매개변수를 사용하여 점수를 전달
	public void calAverage(int theory, int practice) {
		int total = theory + practice; // total은 class의 속성 아님
		average = total / 2;
	}
	
	public void display(int theory, int practice) {
		// 같은 family이므로 메서드에서 메서드 호출 가능
		calAverage(theory, practice);
		System.out.printf("Name: %s\n", name);
		System.out.printf("Average: %.1f", average);
	}
}

//변형2
class Test2 {
	String name;
	double average;
	
	// 매개변수를 사용하여 점수를 전달
	// 평균을 반환(double)
	public double calAverage(int theory, int practice) {
		int total = theory + practice; // total은 class의 속성 아님
		average = total / 2;
		
		return average;
	}
	
	public String display(int theory, int practice) {
		// 같은 family이므로 메서드에서 메서드 호출 가능
		String message = "";
		message = name + ": " + calAverage(theory, practice);
		
		return message;
	}
}

// main class
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	
	public static void test1() {
		Test my = new Test();
		my.name = "Choi Yunha";
		my.calAverage(100, 95);
		my.display();
	}
	
	public static void test2() {
		Test1 my = new Test1();
		my.name = "Choi Yunha";
		my.display(100, 95);
	}
	
	public static void test3() {
		Test2 my = new Test2();
		my.name = "Choi Yunha";
		// my.display(100, 95); // 문자열 반환
		System.out.println(my.display(100, 95));
	}

}
