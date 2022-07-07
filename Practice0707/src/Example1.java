
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	
	public static void test1() {
		// while문으로 구구단 작성
		int dan = 2;
		int su;
		
		while(dan <= 9) {
			su = 1;
			while(su <= 9) {
				System.out.printf("%d X %d = %d\n", dan, su, dan*su);
				su++;
			}
			System.out.println();
			dan++;
		}
	}
	
	public static void test2() {
		// for문으로 구구단 작성
		for(int dan = 2; dan <= 9; dan++) {
			for(int su = 1; su <= 9; su++) {
				System.out.printf("%d X %d = %d\n", dan, su, dan*su);
			}
			System.out.println();
		}
	}
	
	public static void test3() {
		for(int i=1; i<=10; i++) {
			if(i == 5)
				continue; //break;
			System.out.println(i);
		}
	}
	
	public static void test4() {
		for(int i=1; i<=50; i++) {
			if((i % 2 == 0) && (i % 3 == 0))
					continue;
			System.out.println(i);
		}
	}

}
