// 'Calculator' has a 'Number'
class Number {
	public int x, y;
	
	public void setNum(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void display() {
		System.out.printf("%d, %d\n", x, y);
	}
}

class Calculator extends Number {
	public int add() {
		// x, y 그대로 사용 가능
		return x + y;
	}
	
	public int sub() {
		return x - y;
	}
}

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ob = new Calculator();
		ob.setNum(10, 20);
		ob.display();
		System.out.println(ob.add());
		System.out.println(ob.sub());
	}

}
