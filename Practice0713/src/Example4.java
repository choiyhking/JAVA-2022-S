// 대학원생 (교수이면서 학생)
class Person {
	protected String name;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name : %s", name);
	}
}

class Student extends Person {
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String major) {
		// TODO Auto-generated constructor stub
		super.name = name;
		this.major = major;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = super.toString();
		message += String.format("\nmajor : %s", major);
		
		return message;		
	}	
}

class Professor extends Person {
	private String subject; // 과목
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	
	public Professor(String name, String subject) {
		// TODO Auto-generated constructor stub
		super.name = name;
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = super.toString();
		message += String.format("\nsubject : %s", subject);
		
		return message;
	}
}

// 다중 상속: 두개 이상의 클래스로부터 상속
// 자바에서는 다중 상속을 지원하지 않음
/*
class Graduate extends Student, Professor {
	
}
*/

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obs = new Student("kim", "computer");
		System.out.println(obs);
		
		Professor obp = new Professor("park", "english");
		System.out.println(obp);
		
		//--------------------------------
		System.out.println();		
		Person man = new Professor("kim", "computer");
		// man : 하위의 어떤 클래스로부터 객체를 할당 받을 수 있음
		// man으로 호출할 수 있는 메서드는 오버라이딩한 메서드만 호출 가능
		
		if(man instanceof Student)
			System.out.println("Student");
		if(man instanceof Professor)
			System.out.println("Professor");
		System.out.println(man);
		
		//----------------------------------
		System.out.println();
		Person[] mans = {obs, obp};

		for(Person m : mans) {
			if(m instanceof Student)
				System.out.println("Student");
			if(m instanceof Professor)
				System.out.println("Professor");
			System.out.println(m);		
		}	
	}
}
