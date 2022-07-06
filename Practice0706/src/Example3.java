import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}
	
	public static void test1() {
		int count = 1;
		
		while(true) { // 무한 반복
			System.out.println("hello" + count);
			
			if(count == 10)
				break;
			
			count++;
		}
	}
	
	public static void test2() {
		int count = 0;
		
		while(count < 10) {
			System.out.println("korea" + count);
			count++;
		}
	}
	
	public static void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First number: ");
		int first = sc.nextInt();
		
		System.out.print("Last number: ");
		int last = sc.nextInt();
		
		int count = first;
		int total = 0;
		
		while(count <= last) {
			total += count;
			count++;
		}
		
		System.out.println(total);
	}
	
	public static void test4() {
		// 10명의 학생 점수를 입력 받아, 합격자/불합격자 수 구분하기
		Scanner sc = new Scanner(System.in);
		
		int pass = 0;
		int fail = 0;
		int count = 0;
		
		while(count < 10) {
			System.out.print("Enter score: ");
			int score = sc.nextInt();
			
			if(score >= 80) {
				pass++;
			}
			else {
				fail++;
			}
			
			count++;
		}
		System.out.printf("pass: %d, fail: %d\n", pass, fail);
	}
	
	public static void test5() {
		Scanner sc = new Scanner(System.in);
		int score;
		int total = 0;
		
		do {
			System.out.print("Enter a score: ");
			score = sc.nextInt();
			
			total += score;
		} while(score != -1); // 적합하지 않음
		
		System.out.println(total);
	}

}
