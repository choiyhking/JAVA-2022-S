// 패키지는 클래스 여러개를 모은 것
// 자바는 클래스를 나열해서 작성한다(절차식 언어는 함수를 나열)
// 클래스는 객체를 만들기 위한 설계도이다
// 클래스는 class라는 키워드를 사용하고, 옆에 이름을 작성한다
// 일반적으로 클래스의 첫번째 문자는 관습적으로 대문자를 사용한다
// 클래스를 정의할 때 클래스에 들어갈 내용은 { }으로 묶어준다
// 그리고 자바 코드 안에는 대표 클래스(메인 클래스)를 반드시 정의한다
// 메인 클래스 이름은 자바 파일이름(Welcome.java)과 동일하다

// 일반 클래스
class Korea {
	// 빈 클래스
}

class Japan {
	// 빈 클래스
}

// public: 외부에서 접근 가능 <-> private
// 메인 클래스는 반드시 public으로 지정
// 하나의 자바 코드에 public 클래스는 한 개만 존재해야 함
// 메인 클래스는 반드시 main() 메서드가 존재해야 함
// 자바 프로그램을 실행할 때, 메인 클래스의 객체가 자동으로 만들어지고
// 이후에 main() 메서드가 자동으로 한 번 실행된다(시작 명령어 Welcome.main() 자동 실행)
public class Welcome {

	// 메인 메서드(main())
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System 클래스의 out 객체의 println() 메서드를 호출
		System.out.println("Hello"); // 줄바꿈 포함
		System.out.println("world"); 
		System.out.print("Welcome"); // 줄바꿈 없음
		System.out.print(" to Java\n"); // '\n' 줄바꿈 문자
		System.out.println("Good!");
		
		test1();
	}
	
	// 클래스 안에서 정의한 함수 = 메서드
	// 특히 메인 클래스 안의 메서드는 public static을 붙여야 한다
	public static void test1() {
		System.out.println("Welcome to KNU");
	}

}

// 객체(Object)
// 객체는 클래스라는 설계도로부터 생성된다
// 메인 클래스는 프로그램 실행할 때 생성됨
// 객체는 속성과 메서드로 구성
// 속성(필드): 객체를 구성하는 데이터
// 메서드(함수): 객체의 특성, 행동, 기능을 정의