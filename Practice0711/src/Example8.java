class Sample {
	private int x, y;
	
	// 생성자(Constructor)
	// 생성자는 '특수한 메서드'임
	// 생성자는 객체가 만들어 질 때, 자동으로 호출되는 메서드(내가 하는게 아님)
	// 자바 컴파일러가 default 생성자 만들어줌(보이진 않음) -> 끄집어내서 수정 가능
	// 생성자의 형태는 클래스의 이름과 동일, 반환값은 없다
	// 매개변수는 사용자가 정의함
	// 생성자는 외부에서 객체를 생성할 때(main class 등에서..) 호출되므로 public이어야 함
	// 아래 코드 직접 안 적어도 컴파일 할 때 자동 생성
	// 생성자는 진정한 의미의 초기화 함수
	
	// int a; a = 10; -> 지금까지 하던 것
	// int a = 10; -> 생성자
	
	// 기본 생성자: 매개변수가 없는 것
	// 없으면 컴파일러에 의해 자동으로 생성되고 0으로 초기화
	// 필요하다면 사용자가 정의할 수 있음
	public Sample() {
		// setData(1, 1);
		
		// 자기 자신의 생성자를 호출하는 방법
		// this를 함수처럼 사용
		// 단, 생성자 오버로딩에 의해 적합한 생성자가 존재해야 함
		this(1, 1); // 반드시 코드의 맨 위에 있어야 함. 함수 호출은 '호출'->'실행' 과정이므로
		System.out.println("void parameter");
	} 
	 
	// 생성자의 '오버로딩' 성립
	public Sample(int x) {
		System.out.println("1 parameter");
		setData(x, 1);
	}
	
	// 생성자의 '오버로딩' 성립
	public Sample(int x, int y) {
		System.out.println("2 parameter");
		setData(x, y);
	}
	
	// setter
	public void setData(int x, int y) { // 객체가 생성 된 후 속성 값을 '변경'할 때 주로 사용
		// _x, _y 쓰기 싫어..
		// this: 자기 자신의 객체를 의미
		this.x = x;
		this.y = y;
	}
	
	public String display() {
		return String.format("(%d, %d)", this.x, this.y); // 확실하게 명시하기 위해서 this 붙여도 됨(여기선 필요없지만)
	}
}

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ob1 = new Sample(); // 생성자 호출되는 시점!!
		// ob.setData(10, 20); // 객체 생성 후, 속성을 초기화 하는 것
		System.out.println(ob1.display());
		
		// 객체 생성할 때 같이 초기화 하고싶으면? 생성자 사용
		Sample ob2 = new Sample(100);
		System.out.println(ob2.display());
		
		Sample ob3 = new Sample(30, 20);
		System.out.println(ob3.display());
	}

}
