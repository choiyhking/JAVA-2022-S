
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	
	public static void test1() {
		int[] score = {100, 90, 88, 78, 95};
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		System.out.println(sum);
	}
	
	public static void test2() { // 피보나치 수열
		int[] fibo = new int[20];
		fibo[0] = 1; fibo[1] = 1;
		
		for(int i=2; i<fibo.length; i++) {
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		
		for(int i=0; i<fibo.length; i++) {
			System.out.print(fibo[i] + " ");
		}
	}
	
	public static void test3() {
		int[] freq = {1, 2, 3, 4, 5, 4, 3, 2, 1};
		
		for(int i=0; i<freq.length; i++) {
			System.out.printf("%3d: ", i+1);
			for(int j=0; j<freq[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
