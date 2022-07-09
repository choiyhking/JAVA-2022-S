import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	public static void test1() {
		// 1차원 배열
		int[] a = {10, 20, 30, 40, 50,}; // 객체 생성과 동시에 초기화
		int[] b = new int[5]; // 객체만 생성
		
		// 2차원 배열
		int[][] c = {{10, 20}, {30, 40}, {50, 60}};
		System.out.println(c[1][0]); // 30
		
		// 자바에서 2차원 배열의 '열의 개수'는 다를 수 있다(참조변수라는 개념 때문(연결리스트와 비슷))
		int[][] d = {{10}, {20, 30, 40}, {50, 60}, {70}};
		System.out.println(d.length); // 4(행의 개수)
		System.out.println(d[0].length); // 1(각 행의 열의 개수)
		System.out.println(d[1].length); // 3
		System.out.println(d[2].length); // 2
		
		int[][] e = new int[2][]; // 열의 개수가 미정(처음에 생략가능) -> 참조변수라는 개념 때문
		// 따로 정의 해줘야 함
		e[0] = new int[4];
		e[1] = new int[2];
		
		// 배열 d 출력('length' 속성 사용해서, 열이 달라도 처리 가능)
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void test2() {
		// 아파트 인구 수
		Scanner sc = new Scanner(System.in);
		
		//int[][] apt = {{3, 2}, {1, 2}, {4, 2}};
		int[][] apt = new int[3][];
		apt[0] = new int[4];
		apt[1] = new int[3];
		apt[2] = new int[2];
		
		for(int floor=0; floor<apt.length; floor++) {
			for(int house=0; house<apt[floor].length; house++) {
				System.out.printf("%d0%d: ", floor+1, house+1);
				apt[floor][house] = sc.nextInt();
			}
		}
		
		int total = 0; // 전체 인구
		
		for(int floor=0; floor<apt.length; floor++) {
			for(int house=0; house<apt[floor].length; house++) {
				total += apt[floor][house];
			}
		}
		
		System.out.println("total: " + total);
	}

}
