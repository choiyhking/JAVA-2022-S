// 삼각형, 사각형 면적 구하기
interface Shape {
	void computeArea();
}

class Data {
	public double width;
	public double height;
	
	public Data(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}
}

class Rectangle extends Data implements Shape {
	
	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		super(width, height);
	}
	
	@Override
	public void computeArea() {
		// TODO Auto-generated method stub
		System.out.printf("retangle area : %.1f\n", width * height);
	}
}

class Triangle extends Data implements Shape {
	
	public Triangle(double width, double height) {
		// TODO Auto-generated constructor stub
		super(width, height);
	}
	
	@Override
	public void computeArea() {
		// TODO Auto-generated method stub
		System.out.printf("triangle area : %.1f\n", (width * height) / 2);
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Shape[] ob = new Shape[2];
		ob[0] = new Rectangle(15.3, 23.4);
		ob[1] = new Triangle(15.3, 23.4);
		
		/*
		for(int index = 0; index < 2; index++) {
			ob[index].computeArea();
		}*/
		
		for(Shape sh : ob) {
			sh.computeArea();
		}
	}	
}
