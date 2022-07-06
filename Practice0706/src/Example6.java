import java.util.Scanner;

class Grade {
	int score;
	int sum;
	double avg;
	int a_count, b_count, c_count, f_count; // 학점 개수
	int cnt; // 학생 수
	// 객체 속성의 초기 값은 자동으로 0, 0.0, false로 초기화 됨
	
	public void inputGrade() { // 점수 입력
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter score: ");
			score = sc.nextInt();
			if(score == -1)
				break;
			
			cnt++;
			sum += score;
			
			detGrade();
		}
	}
	
	public void detGrade() { // 등급 결정
		if(score >= 90)
			a_count++;
		else if(score >= 80)
			b_count++;
		else if(score >= 70)
			c_count++;
		else
			f_count++;
	}
	
	public void displayGrade() {
		avg = (double)sum / cnt;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		System.out.printf("A: %d, B: %d, C: %d, F: %d\n", a_count, b_count, c_count, f_count);
	}
}

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade ob = new Grade();
		ob.inputGrade();
		ob.displayGrade();
	}

}
