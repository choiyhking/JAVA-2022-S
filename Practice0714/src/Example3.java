// 제네릭(Generic) : 하나의 정해진 자료(객체)만 사용하는 것이 아니라
// 다양한 참조 자료형을 사용할 수 있도록 함
// <T> : 다이아몬드 연산자
// T : Type parameter -> 기본 데이터 타입은 지원하지 않음

class Sample<T> {
	private T data;
	
	public Sample(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;		
	}
	
	public T getData() {
		return this.data;
	}
}

class Sample1<T, V> {
	private T data1;
	private V data2;
	
	public Sample1(T data1, V data2) {
		// TODO Auto-generated constructor stub
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public T getData1() {
		return this.data1;
	}
	
	public V getData2() {
		return this.data2;
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();
	}
	
	public static void test1() {
		Sample<Integer> ob1 = new Sample<Integer>(10);
		System.out.println(ob1.getData());
		
		Sample<Double> ob2 = new Sample<Double>(10.3);
		System.out.println(ob2.getData());
		
		Sample<String> ob3 = new Sample<String>("hello");
		System.out.println(ob3.getData());
	}
	
	public static void test2() {
		Sample1<Integer,Double> ob1 = new Sample1<>(10, 13.4);
		System.out.println(ob1.getData1());
		System.out.println(ob1.getData2());
		
		Sample1<String, Integer> ob2 = new Sample1<>("hello", 13);
		System.out.println(ob2.getData1());
		System.out.println(ob2.getData2());
	}

}
