// 클래스 A가 클래스 B를 '소유'한다(A에는 B의 객체를 속성으로 가진다)(A 'has a' B)
// "Circle has a Point"
class Point {
	private int x, y;
	
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getPoint() {
		return String.format("(%d, %d)", x, y);
	}
}

class Circle {
	// Point 객체를 속성으로 갖는다
	private Point center;
	private int radius; // 반지름
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
		
		showCircle.displayCircle(this);
	}
	
	public String getCircle() {
		String msg = "";
		
		msg += String.format("Center: %s\n", center.getPoint());
		msg += String.format("Radius: %d", this.radius);
		
		return msg;
	}
}

// 메시지 출력용
class showCircle {
	static void displayCircle(Circle c) { // static -> 객체를 만들지 않아도 사용 가능
		System.out.printf(c.getCircle());
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt1 = new Point(10, 20);
		// Circle c1 = new Circle((10, 20), 10); <- 이렇게는 안 됨!!(객체가 들어갈 자리이므로, 객체를 만들어서 넣어야함)
		Circle c1 = new Circle(pt1, 10);
		//System.out.println(c1.getCircle());
	}

}
