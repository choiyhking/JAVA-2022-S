class Time {
	int fullSec, hour, min, sec;
	
	public void convertTime() {
		hour = (fullSec / 60) / 60;
		min = (fullSec / 60) % 60;
		sec = fullSec % 60;
	}
	
	public void displayTime() {
		System.out.printf("%02d:%02d:%02d\n", hour, min, sec);
	}
}

// 변형
class Time1 {
	
	public int getHour(int fullSec) {
		int hour = (fullSec / 60) / 60;
		return hour;
	}
	
	public int getMin(int fullSec) {
		int min = (fullSec / 60) % 60;
		return min;
	}
	
	public int getSec(int fullSec) {
		int sec = fullSec % 60;
		return sec;
	}
	
	public void convertTime(int fullSec) {
		int hour = (fullSec / 60) / 60;
		int min = (fullSec / 60) % 60;
		int sec = fullSec % 60;
	}
	
	public void displayTime(int fullSec) {
		int hour = getHour(fullSec);
		int min = getMin(fullSec);
		int sec = getSec(fullSec);
		System.out.printf("%02d:%02d:%02d\n", hour, min, sec);
	}
}

// 메인 클래스
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}

	public static void test1() {
		Time my = new Time();
		my.fullSec = 7546; 
		my.convertTime();
		my.displayTime();
	}
	
	public static void test2() {
		Time1 my = new Time1();
		my.displayTime(8636);
	}
	
	public static void test3() {
		Time1 you = new Time1();
		int hour = you.getHour(8363);
		int min = you.getMin(8363);
		int sec = you.getSec(8363);
		System.out.printf("%02d-%02d-%02d\n", hour, min, sec);
	}
}
