import java.util.Scanner;

class Grade {
	int[] score; // score는 객체 참조변수
	int sum;
	double avg;
	
	public void computeGrade() {
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		avg = (double)sum / score.length;
	}
	
	public void chart() {
		int[] freq = new int[11]; // 11개의 등급(0~10)
		
		for(int i=0; i<score.length; i++) {
			freq[score[i]/10]++; // 100점: 10등급, 67점: 6등급, 8점: 0등급...
		}
		
		for(int i=0; i<freq.length; i++) {
			System.out.print("Grade" + i + ": ");
			for(int j=0; j<freq[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			Grade student = new Grade();
			student.score = new int[10]; // 배열 객체 정의 필요, 10명의 학생
			
			for(int i=0; i<student.score.length; i++) {
				System.out.print("Score ? ");
				student.score[i] = sc.nextInt();
			}
			
			student.chart();
	}
}
