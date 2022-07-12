class Student {
	// 외부에서 초기화하지 못하도록 private 설정
	private String name;
	private int kor, eng, math;
	private int total;
	
	// setter
	public void setName(String n, int k, int e, int m) {
		name = n;
		kor = k; eng = e; math = m;
	}
	
	private double computeAvg() {
		total = kor + eng + math;
		
		return (double)total / 3;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Avg: " + computeAvg());
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student man = new Student();
		// man.name = "Hong"; // 불가능
		
		man.setName("Park", 100, 90, 80);
		man.display();
	}

}
