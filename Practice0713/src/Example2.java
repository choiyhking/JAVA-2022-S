import java.util.Arrays;
import java.util.Scanner;

class Grade {
	protected int[] score;
	protected int counter; // 인원
	
	public void setScore() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("number ? ");
		this.counter = input.nextInt();
		
		System.out.printf("input %d score : ", counter);
		this.score = new int[counter];
		for(int index = 0; index < score.length; index++) {
			score[index] = input.nextInt();
		}
	}
	
	public String displayScore() {
		String message = "score = "; 
		message += Arrays.toString(this.score);
		
		return message;
	}
}

class Grade2 extends Grade {
	protected int total;
	protected double average;
	
	public void getGrade() {
		for(int s : super.score) {
			total += s;
		}
		average = (double)total / super.counter;
	}
	
	@Override
	public String displayScore() {
		// TODO Auto-generated method stub
		String message = super.displayScore();
		message += String.format("\ntotal : %d\n", this.total);
		message += String.format("average : %.1f", this.average);
		
		return message;
	}
}

class Grade3 extends Grade2 {
	protected int acount, bcount, ccount, fcount;
	
	public void determineGrade() {
		for(int s : super.score) {
			switch(s / 10) {
			case 10: case 9:
				acount++;
				break;
			case 8:
				bcount++;
				break;
			case 7:
				ccount++;
				break;
			default:
				fcount++;
			}
		}
	}
	
	@Override
	public String displayScore() {
		// TODO Auto-generated method stub
		String message = super.displayScore();
		message += String.format("\nA:%d, B:%d, C:%d, F:%d", acount, bcount, ccount, fcount);
		
		return message;
	}
	
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3();
	}
	
	public static void test1() {
		Grade my = new Grade();
		my.setScore();
		System.out.println(my.displayScore());
	}
	
	public static void test2() {
		Grade2 my = new Grade2();
		my.setScore();
		my.getGrade();
		System.out.println(my.displayScore());
	}
	
	public static void test3() {
		Grade3 my = new Grade3();
		my.setScore();
		my.getGrade();
		my.determineGrade();
		System.out.println(my.displayScore());
	}
}
