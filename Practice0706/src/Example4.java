import java.util.Scanner;

// helloABC1234@#$%korea
class Check {
	int ndigit = 0; // 숫자 개수
	int nchar = 0; // 문자 개수
	int other = 0; // 특수문자 개수
	
	public void countLetter(String str) {
		int count = 0;
		char c;
		
		while(count < str.length()) { // 문자열의 길이만큼 반복
			c = str.charAt(count); // 문자 하나씩 가져오기
			
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
				nchar++;
			else if(c >= '0' && c <= '9')
				ndigit++;
			else
				other++;
				
			count++;
		}
	}
	
	public void displayLetter() {
		System.out.println(ndigit + " " + nchar + " " + other);
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String message = sc.nextLine();
		
		Check ob = new Check();
		
		ob.countLetter(message);
		ob.displayLetter();
	}

}
