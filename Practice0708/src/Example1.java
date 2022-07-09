import java.util.Scanner;

class Score {
	String name;
	int kor, eng, math;
	int sum;
	double avg;
	
	public void computeScore() {
		sum = kor + eng + math;
		avg = (double)sum / 3;
	}
	
	public void display() {
		computeScore();
		System.out.printf("name: %s, sum: %d, avg: %.1f\n", name, sum, avg);
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	public static void test1() {
		Scanner sc = new Scanner(System.in);
		Score st = new Score();
		
		System.out.print("Name ? ");
		st.name = sc.nextLine();
		
		System.out.print("Kor ? ");
		st.kor = sc.nextInt();
		
		System.out.print("Eng ? ");
		st.eng = sc.nextInt();
		
		System.out.print("Math ? ");
		st.math = sc.nextInt();
		
		st.display();
	}
	
	public static void test2() {
		Scanner sc = new Scanner(System.in);
		Score[] st = new Score[3]; // Score 객체 3개를 가진 객체배열
		
		for(int i=0; i<st.length; i++) {
			st[i] = new Score(); // 배열요소(참조변수)의 객체 생성
			
			System.out.print("Name ? ");
			st[i].name = sc.nextLine();
			
			System.out.print("Kor ? ");
			st[i].kor = sc.nextInt();
			
			System.out.print("Eng ? ");
			st[i].eng = sc.nextInt();
			
			System.out.print("Math ? ");
			st[i].math = sc.nextInt();
			
			// 점수를 입력하고 마지막에 입력한 '\n'(e.g. 87'\'n')가 문자를 입력 받을 때 영향을 미친다
			// 버퍼에 '\n' 있음 -> 비워줘야 함
			sc.nextLine();
		}
		
		for(int i=0; i<st.length; i++) {
			st[i].display();
		}
	}

}
