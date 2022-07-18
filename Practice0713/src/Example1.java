// 좌표
class Axis{
	private int x, y;
	
	public Axis() {
		// TODO Auto-generated constructor stub
	}
	
	public Axis(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 객체를 문자열화
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "";
		message += String.format("(%d, %d)", this.x, this.y);
		
		return message;
	}
}

class Circle extends Axis {
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "center: " + super.toString();
		message += String.format("\nradius: %d",  this.radius);
		
		return message;
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axis center = new Axis(100, 200);
		System.out.println(center);
		
		Circle mycircle = new Circle(200, 250, 10);
		System.out.println(mycircle);
	}

}
