class Grade {
	private String name; // 과목 이름
	private int[] score;
	
	// 클래스 내부에 기본 생성자가 자동으로 만들어질까?
	// 생성자 자체가 없을 경우 O
	// 일반 생성자 있을 경우 X
	// ctrl+space 누르면 바로 만들 수 있음 -> 일반 생성자만 만들면 사용자에 의해 오류 발생할 수 있기 때문에 껍데기만 만들어 주자!
	public Grade() {
		// TODO Auto-generated constructor stub
	}
	
	// 일반 생성자
	public Grade(String name, int[] score) {
		this.name = name;
		this.score = score;
	}
	
	// setter 생략(시간 관계상..)
	// getter
	public String getName() {
		return name;
	}
	
	private double getAvg() {
		int total = 0;
		
		for(int n : score) {
			total += n;
		}
		
		return (double)total / score.length;
	}
	
	public String display() {
		String message = String.format("Avg: %.1f", getAvg());
		
		return message;
	}
}

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {100, 90, 80, 70, 60};
		Grade my = new Grade("java", s);
		
		System.out.println("Course: " + my.getName());
		System.out.println(my.display());
	}

}
