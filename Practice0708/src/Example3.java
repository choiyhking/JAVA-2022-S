import java.util.Arrays; // import 필요

// 객체를 생성해서 쓰는 클래스
// 객체를 생성하지 않고 쓰는 클래스(System, Arrays, ...) => 클래스 이름으로 메서드를 사용
// Arrays c = new Arrays(); -> c.method() (x)

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	public static void test1() {
		// 'Arrays' class
		int[] a = {10, 20, 30, 40, 50};
		int[] b = new int[5];
		
		// 형식화된 배열 요소의 출력 "[x, x, x, ...]" <= 문자열임
		System.out.println(Arrays.toString(a)); // 주로 배열에 들어있는 값 확인할 때 사용
		
		// 배열 요소에 초기값을 지정		
		Arrays.fill(b, 10); // 배열 b를 10으로 초기화 => {10, 10, 10, 10, 10}
		System.out.println(Arrays.toString(b));
		
		// 크기 비교 => t/f
		if(Arrays.equals(a, b))
			System.out.println("Same!");
		else
			System.out.println("Different!");
	}
	
	public static void test2() {
		String[] color1 = {"red", "blue", "green"};
		String[] color2 = {"red", "blue", "green"};
		
		// 정렬
		Arrays.sort(color1);
		System.out.println(Arrays.toString(color1));
		
		// 탐색(binary search)
		int idx = Arrays.binarySearch(color1, "red"); // color2를 쓰면 오류 => binary search는 반드시 정렬된 상태여야 함
		System.out.println(idx); // 결과 값이 음수면 찾는 것 없다
	}

}
