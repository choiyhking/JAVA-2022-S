// 접근 제어: public, private, protected
class Book {
	private int poem;
	private int comic;
	private int magazine;
	
	// 객체가 생성될 때 초기화해주는 특별한 메서드(생성자)
	// default 생성자: 생성자가 없으면 자동으로 만들어짐
	public Book() {
		System.out.println("start");
		this.poem = 1;
		this.comic = 1;
		this.magazine = 1;
	}
	
	// 생성자 오버로딩
	public Book(int poem) { // 매개변수 1개
		/*this.poem = poem;
		this.comic = 1;
		this.magazine = 1;*/
		
		//this.setBook(poem, 1, 1);
		this(poem, 1, 1);
	}
	
	public Book(int poem, int comic) { // 매개변수 2개
		/*this.poem = poem;
		this.comic = comic;
		this.magazine = 1;*/
		
		//this.setBook(poem, comic, 1);
		
		// 또 다른 방법
		// this를 함수처럼 사용
		// 생성자 코드의 맨 위에 작성(다른 코드를 실행하기 전에 생성자를 호출해야 함)
		this(poem, comic, 1);
	}
	
	public Book(int poem, int comic, int magazine) { // 매개변수 3개
		/*this.poem = poem;
		this.comic = comic;
		this.magazine = magazine;*/
		
		this.setBook(poem, comic, magazine);
	}
	
	// 생성자 만드는 과정에서 같은 코드 중복 -> setter 활용
	
	
	// setter(설정자)
	// 객체가 만들어지고 난 후, 값을 간접적으로 초기화
	public void setBook(int poem, int comic, int magazine) {
		this.poem = poem;
		this.comic = comic;
		this.magazine = magazine;
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book mybook = new Book(10, 20); // <- 객체가 만들어지는 시점
		
		//mybook.setBook(10, 5, 8);
	}
	
}
