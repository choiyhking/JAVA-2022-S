// 클래스 설계할 때 중요한 것들은 함부로 접근 못하게 하자
class Fruit {
	int apple; // default: 같은 패키지에서 접근 가능(e.g. Practice0711 내에서는 모두 가능)
	public int banana; // 무조건 외부에서 접근 가능(public)
	private int lemon; // 외부에서 접근 불가능(private)
	private int total;
	
	// 설정자 메서드 정의(setter)
	public void setLemon(int n) {
		lemon = n;
	}
	
	// 접근자 메서드 정의(getter)
	public int getTotal() {
		return total;
	}
	
	private void totalFruit() {
		// 같은 클래스 내부에서는 모두 접근 가능
		total = apple + banana + lemon;
	}
	
	public void display() {
		totalFruit();
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit gift = new Fruit();
		
		gift.apple = 10;
		gift.banana = 20;
		// gift.lemon = 5; // 접근 불가능
		
		// private 속성에 어떻게 접근?
		// 간접적으로 접근
		// 설정자 메서드(setter)
		gift.setLemon(5);
		// gift.totalFruit(); -> 접근 불가능
		gift.display();
		
		// gift.total = 100; // 문제 발생 가능! -> private으로 지정
		
		// System.out.println(gift.total); -> 접근 불가능
		// 접근자 메서드(getter)
		System.out.println(gift.getTotal());
		
	}

}
