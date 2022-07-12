import java.util.Scanner;

// 기수와 지수를 이용하여 계산
class Exponent {
	private int radix; // 기수
	private int expo; // 지수
	private int result;
	
	// setter
	public void setData(int _radix, int _expo) {
		if(_radix < 0) {
			System.out.println("[Error]Radix should be greater than 0");
			System.exit(0); // 프로그램 종료
		}
		radix = _radix;
		expo = _expo;
		
		// 속성 정의할 때 값 초기화 하는 것은 좋지 않음
		result = 1;
		
		computeResult();
	}
	
	// getter
	public int getResult() {
		return result;
	}
	
	private void computeResult() {
		for(int i=0; i<expo; i++)
			result *= radix;
	}
}

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Radix ? ");
		int radix = sc.nextInt();
	
		System.out.print("Exponent ? ");
		int expo = sc.nextInt();
		
		Exponent ob = new Exponent();
		ob.setData(radix, expo);
		System.out.println("Result: " + ob.getResult());
	}

}
