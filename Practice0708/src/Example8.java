class Data2 {
	int n1 = 10;
	int n2 = 20;
}

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	public static void swap(int n1, int n2) { // call-by-value
		int temp;
		
		// 값이 복사되어 전달되었으므로 원본은 안 바뀜
		temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
	public static void test1() {
		int number1 = 10;
		int number2 = 20;

		System.out.println(number1 + ", " + number2);
		
		swap(number1, number2);
		
		System.out.println(number1 + ", " + number2);
	}
	
	public static void swap2(Data2 oc) { // call-by-reference
		// Data2 ob = oc; => 참조변수의 복사(같은 곳을 가리키게 됨)
		int temp = oc.n1;
		oc.n1 = oc.n2;
		oc.n2 = temp;
	}
	
	public static void test2() {
		Data2 ob = new Data2();
		
		swap2(ob); // 객체를 인수로 전달
		
		System.out.println(ob.n1 + ", " + ob.n2);
	}

}
