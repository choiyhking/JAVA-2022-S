// 객체 배열(객체 '참조변수'를 요소로 한다. 객체 자체가 배열의 요소가 아님!)
// String 배열도 동일. 문자열 자체가 배열 요소가 아니라 '참조값'이 요소임. 그것들이 어딘가에 있는 문자열(객체)을 가리키는 형태임

class Point {
	int x, y;
	
	public void display() {
		System.out.printf("(%d, %d)\n", x, y);
	}
}

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	
	public static void test1() {
		String name1 = "Kim"; // = new String("Kim"); -> name은 참조변수
		String name2 = "Lee";
		String name3 = "Park";
		
		String[] family = {name1, name2, name3};
		
		for(int i=0; i<family.length; i++) {
			System.out.println(family[i]);
		}
	}
	
	public static void test2() {
		// 문자열(객체) 배열
		String[] week = {"AB", "CD", "EF", "GH", "IJ", "KL"};
		String total = ""; // 빈 문자열
		
		for(int i=0; i<week.length; i++) {
			total += week[i];
		}
		
		System.out.println(total);
	}
	
	public static void test3() {
		Point pt1 = new Point(); // pt1은 참조변수. 어딘가에 있는 실제 객체를 가리킨다
		pt1.x = 10; pt1.y = 20;
		
		Point pt2 = new Point();
		pt2.x = 30; pt2.y = 40;

		Point pt3 = new Point();
		pt3.x = 50; pt3.y = 60;
		
		// 여러 객체를 하나로 묶기
		// Point 클래스의 객체 3개를 요소로 가지는 객체배열
		Point[] pts = {pt1, pt2, pt3};
		
		for(int i=0; i<pts.length; i++) {
			pts[i].display();
		}
	}
	
	public static void test4() {
		Point[] pts = new Point[5]; // pts[0], pts[1], pts[2]: Point 클래스의 객체
		
		for(int i=0; i<pts.length; i++) {
			pts[i] = new Point();
			pts[i].x = i * 10;
			pts[i].y = i * 20;
			
			pts[i].display();
		}
	}

}
