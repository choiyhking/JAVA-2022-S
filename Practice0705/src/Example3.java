// 성적 클래스
class Student {
	String name;
	int mid_score;
	int fin_score;
	int total;
	double average;
	
	public void calTotal() {
		total = mid_score + fin_score;
	}
	
	public void calAverage() {
		average = total / 2;
	}
	
	public void display() {
		System.out.printf("%s's average is %.1f\n", name, average);
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Kim = new Student();
		Kim.name = "Kim Sangsu";
		Kim.mid_score = 95;
		Kim.fin_score = 80;
		Kim.calTotal();
		Kim.calAverage();
		Kim.display();
	}

}
