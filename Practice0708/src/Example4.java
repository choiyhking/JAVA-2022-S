import java.util.Arrays;

// Enhanced for loop
// "for(변수 : 배열 이름)" -> 배열에서 차례대로 값을 가져와서 변수에 담는다
// 값만 가져와서 쓰면 될 경우에 사용하면 편리함

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	public static void test1() {
		int[] number = {10, 20, 30, 40, 50, 60};
		int sum = 0;
		
		for(int n : number) { // n은 배열로 부터 가져온 요소, number는 배열 참조변수, 배열 요소의 개수 만큼 반복
			sum += n;
		}
		
		System.out.println(sum);
	}
	
	public static void test2() {
		int[][] number = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
		int sum = 0;
		
		for(int[] num : number) { // number로 부터 가져온 요소가 '1차원 배열'임
			System.out.println(Arrays.toString(num));
			
			for(int n : num) {
				sum += n;
			}
		}
		
		System.out.println(sum);
	}
	
}
