import java.util.Scanner;

class Data {
	int[] score; // 참조변수(실제 배열의 주소값 가짐)
	
	public int getSum() {
		int sum = 0;
		
		for(int i=0; i<score.length; i++)
			sum += score[i];
		
		return sum;
	}
	
	public int getMax() {
		int max = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		return max;
	}
}

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	
	public static void test1() {
		int[] score = {66, 55, 48, 75, 98, 36, 85};
		
		int max = score[0], min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
		}
		
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void test2() {
		Data ob = new Data();
		
		// 초기값이 미리 결정되어 있는 경우
		int[] s = {66, 55, 48, 75, 98, 36, 85};
		ob.score = s; // 여기서 바로 직접 초기화 못함(바로 할당은 처음에만 가능)
		
		// ob.score = {66, 55, 48, 75, 98, 36, 85}; (X)
		
		System.out.println(ob.getSum());
		System.out.println(ob.getMax());
	}
	
	public static void test3() {
		Data ob = new Data();
		Scanner sc = new Scanner(System.in);
		
		ob.score = new int[6];
		
		for(int i=0; i<ob.score.length; i++) {
			System.out.print("Score ? ");
			ob.score[i] = sc.nextInt();
		}

		System.out.println(ob.getSum());
		System.out.println(ob.getMax());
	}
	
}
