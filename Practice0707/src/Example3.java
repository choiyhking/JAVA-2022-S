import java.util.Scanner;

// 문자열에서 특정 문자의 개수 구하기
class Repeat {
	// 속성 -> 언제든지 접근 가능, 수정 가능(위험요소)
	String input;
	char letter;
	int cnt;
	
	public void count() {
		for(int i=0; i<input.length(); i++) {
			if(letter == input.charAt(i)) {
				cnt++;
			}
		}
	}
	
	public void display() {
		System.out.println(cnt);
	}
}

class Repeat1 {
	// 위험요소 제거 -> 확실한 보호 방법은 아님
	
	public int count(String input, char letter) { // 매개변수 활용
		int cnt = 0;
		
		for(int i=0; i<input.length(); i++) {
			if(letter != input.charAt(i)) {
				continue;
			}
			cnt++;
		}
		
		return cnt;
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	
	// message와 letter에 직접 접근하는 것은 좋지 않음. 객체지향언어의 가장 중요한 특성은 '정보 은닉'(클래스 보호)
	public static void test1() {
		Scanner sc = new Scanner(System.in);
		Repeat ob = new Repeat();
		
		System.out.print("Enter a message: ");
		ob.input = sc.nextLine();
		
		System.out.print("Enter a character: ");
		ob.letter = sc.next().charAt(0);
		
		ob.count();
		ob.display();
	}
	
	public static void test2() {
		Scanner sc = new Scanner(System.in);
		Repeat1 ob = new Repeat1();
		
		System.out.print("Enter a message: ");
		String input = sc.nextLine();
		
		System.out.print("Enter a character: ");
		char letter = sc.next().charAt(0);
		
		int cnt = ob.count(input, letter);
		
		System.out.println(cnt);
	}

}
