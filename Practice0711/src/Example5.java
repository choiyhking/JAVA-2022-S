class Point {
	private int x, y;
	
	// setter
	// 값 설정하는 역할
	// 입력된 값을 '검사하는 역할'
	// e.g. x는 100~200, y는 150~300
	public void setPoint(int _x, int _y) {
		setX(_x);
		setY(_y);
	}
	
	public void setX(int _x) {
		if(_x >= 100 && _x <= 200)
			x = _x;
		else
			System.out.println("X is out of range!");
	}
	
	public void setY(int _y) {
		if(_y >= 150 && _y <= 300)
			y = _y;
		else
			System.out.println("Y is out of range!");
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// 기본 제공 출력 -> 사용자가 수정 못함
	public void displayPoint() {
		System.out.printf("(%d, %d)\n", x, y);
	}
	
	// 문자열로 리턴 해줄게 -> 사용자 입장에서 더 좋음
	public String display() {
		//return "[" + x + ", " + y + "]";
		
		// 형식화 된 문자열 생성 가능
		String message = String.format("[%d, %d]", x, y);
		
		return message;
	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt1 = new Point();
		// pt1.x = 100 -> 불가능
		pt1.setX(130);
		pt1.setY(170);
		pt1.displayPoint();
		
		Point pt2 = new Point();
		pt2.setPoint(120, 400);
		pt2.displayPoint();
		
		// 내가 마음대로 출력하고 싶을 때
		System.out.printf("x = %d, y = %d\n", pt1.getX(), pt1.getY());
		System.out.println("Result is " + pt2.display());
	}

}
