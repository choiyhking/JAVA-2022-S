
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	public static int getMax1(int n1, int n2) {
		int max;
		
		if(n1 > n2)
			return n1;
		else
			return n2;
	}
	
	public static int getMax2(int n1, int n2, int n3) {
		int max;
		
		if(n1 > n2)
			max = n1;
		else
			max = n2;
		
		if(n3 > max)
			max = n3;
		
		return n3;
	}
	
	public static int getMax3(int[] ary) {
		int max = ary[0];
		
		/*for(int i=0; i<ary.length; i++) {
			if(max < ary[i])
				max = ary[i];
		}*/
		
		for(int n : ary) {
			if(n > max)
				max = n;
		}
		
		return max;
	}
	
	// 여러 개의 매개변수(parameter)를 '동적으로' 처리하는 방법
	// 매개변수를 배열로 전달 받음
	// public static int getMax4(int n1, int n2, int n3, int n4, int n5) {} // 어쩔 수 없이 이렇게 받아야 할 때
	public static int getMax4(int... number) {
		int max = 0;
		
		System.out.println(number.length);
		
		for(int n : number) {
			//System.out.println(n);
			if(max < n)
				max = n;
		}
		
		return max;
	}
	
	
	public static void test1() {
		System.out.println(getMax1(10, 20));
		System.out.println(getMax2(10, 20, 30));
		
		int[] number = {10, 20, 30, 40, 50};
		System.out.println(getMax3(number));
		System.out.println(getMax4(10, 20, 30, 40, 50));
	}
	
	// 메서드 오버로딩(Overloading)
	// 메서드의 이름은 같으나 매개변수의 개수, 데이터 타입이 다르면 서로 다른 메서드
	// 메서드 오버로딩은 반환값의 종류하고는 관계없다

	public static void computeAdd() {
		System.out.println("no parameter");
	}
	
	public static void computeAdd(int n1) { // 매개변수 1개
		System.out.println(n1+10);
	}
	
	public static void computeAdd(double n1, double n2) { // 매개변수 2개
		System.out.println(n1+n2);
	}
	
	// 오류
	/*public static int computeAdd(int n1, int n2) { // 매개변수 2개
		System.out.println(n1+n2);
	}*/
	
	public static void test2() {
		// 매개변수를 몇 개 전달하느냐에 따라서 호출되는 함수가 다름
		computeAdd();
		computeAdd(10);
		computeAdd(10, 20);
		computeAdd(10.1, 20.3);
	}

}
