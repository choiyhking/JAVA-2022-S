class Counter {
	static int number;
	
	public static void increment() { // void형 메서드
		number++;
	}
	
	// 오버로딩 성립
	public static void increment(int n) { // 1개의 매개변수
		number += n;
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter ob = new Counter();
		
		System.out.println(ob.number);
		
		ob.increment(); // +1
		ob.increment(); // +1
		ob.increment(5); // +5
		System.out.println(ob.number);
		
		// 객체 생성 없이 호출 가능
		Counter.increment(); // 클래스 이름으로 메서드 호출
		System.out.println(Counter.number);
	}

}
