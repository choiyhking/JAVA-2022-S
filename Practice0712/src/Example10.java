// 'Student' is a 'Person'
class Person {
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	// 객체를 문자열로 변환
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "";
		message += String.format("Name: %s\n", name);
		message += String.format("Age: %d\n", age);
		
		return message;
	}
	
}

class Student extends Person {
	private String major;
	
	// name, age도 상속 받았으므로, 초기화 해야 할 의무가 있다
	// public이었다면 super.age로 하면된다
	// 하지만 private이므로 직접 접근 불가능 -> 부모 생성자를 활용
	
	// Student 생성자가 호출되는 순간, 부모 클래스의 기본 생성자를 호출하려고 할 것임
	// super()로 부모 클래스의 일반 생성자를 직접 호출 해줘야 함
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	// 오버라이딩(Overriding)
	// 상속 관계에서 부모가 정의한 메서드를, 자식이 같은 이름으로 재정의 하는 것
	// 같은 이름으로 메서드 정의가 가능하다
	// 어차피 하는 일 거의 같으니까 이름 통일하자 -> 같은 이름 메서드가 2개 존재하게 됨
	// super.method(), this.method()
	
	/*public void display() { 
		super.display();
		System.out.println("Major: " + major);
	}*/
	
	// ctrl+space 눌러서 쉽게 만들기
	@Override // annotation: 아래의 메서드는 오버라이딩 된 것임을 알려줌
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Major: " + major);
	}
	
	// object 클래스(최상급 클래스)에 있는 toString() 메서드
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String msg = super.toString();
		msg += String.format("Major: %s", this.major);
		
		return msg;
	}
	
}

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student man = new Student("Kim", 25, "CS");
		man.display();
		System.out.println(man); // 메서드 호출 없이 객체를 변수처럼 사용
		
		Person ob = new Person("Lee", 25);
		System.out.println(ob.toString());
		System.out.println(ob);
	}

}
