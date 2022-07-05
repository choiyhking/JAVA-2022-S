// 클래스는 객체의 설계도(틀)
// 자바 코드 안에 여러개의 클래스를 정의할 경우, public은 오직 하나

// x좌표와 y좌표를 속성으로 가지는 Point class
class Point {
	// 속성 정의
	int x;
	int y;
	
	// 메서드 정의
	void display1() {
		// x와 y는 클래스 내부에 정의되어 있으므로 same family
		// 메서드 내에서는 마음대로 사용가능
		System.out.println("x = " + x + ", y = " + y);
	}
	
	void display2() {
		System.out.printf("(%d, %d)\n", x, y);
	}
}

// main class : 반드시 public이어야 함
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	public static void test1() {
		// Point class의 객체를 생성
		Point pt1; // 'pt'는 실제 객체 아님. 어딘가에 있는 실제 객체의 참조값을 갖는 변수(=포인터, =주소값)
		pt1 = new Point(); // 실제 객체 생성(Point class 크기의 메모리를 할당)
				
		// 객체 참조변수를 이용하여 속성에 접근
		pt1.x = 10;
		pt1.y = 20;
		
		// 무식한 방법
		System.out.println("x = " + pt1.x + ", y = " + pt1.y);
		System.out.printf("x = %d, y = %d\n", pt1.x, pt1.y);
		
		// 두 번째 객체
		Point pt2 = new Point();
		pt2.x = 30;
		pt2.y = 40;
		
		// 무식한 방법
		System.out.println("(" + pt2.x + ", " + pt2.y + ")");
		System.out.printf("(%d, %d)\n", pt2.x, pt2.y);
	}
	
	public static void test2() {
		Point pt1 = new Point();
		pt1.x = 100;
		pt1.y = 200;
		
		pt1.display1();
		pt1.display2();
		
		Point pt2 = new Point();
		pt2.x = 300;
		pt2.y = 400;
		pt2.display2();
	}

}