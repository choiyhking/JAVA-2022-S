public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	public static void test1() {
		int number1 = 10, number2 = 3;
		System.out.println(number1 / number2); // 몫
		System.out.println(number1 % number2); // 나머지
		
		number1 += 1;
		//number1++;
		//++number1;
		System.out.println(number1);
	}
	
	public static void test2() {
		// 초 단위의 시간을 시, 분, 초로 나타내기
		int fullsec = 9278;
		int hour = (fullsec / 60) / 60;
		int min = (fullsec / 60) % 60;
		int sec = fullsec % 60;
		
		System.out.println(hour + "h " + min + "m " + sec + "s ");
		System.out.printf("%dh %dm %ds", hour, min, sec);
	}
}