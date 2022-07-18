import java.util.ArrayList;
import java.util.Queue;

class Point {
	int x, y;
	
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d, %d)", x, y);
	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3();
	}
	
	public static void test1() {
		// ArrayList 클래스
		ArrayList<Integer> ob = new ArrayList<>();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		System.out.println(ob.size());
		System.out.println(ob.toString());
		ob.remove(1);
		System.out.println(ob.toString());
		ob.add(1, 50);
		System.out.println(ob.toString());
	}
	
	public static void test2() {
		ArrayList<String> ob = new ArrayList<>();
		ob.add("kim");
		ob.add(0, "lee");
		System.out.println(ob.toString());		
	}
	
	public static void test3() {
		Point pt1 = new Point(10, 20);
		Point pt2 = new Point(30, 40);
		Point pt3 = new Point(50, 60);
		
		ArrayList<Point> ob = new ArrayList<>();
		ob.add(pt1);
		ob.add(pt2);
		ob.add(pt3);
		System.out.println(ob.toString());
	}
}
