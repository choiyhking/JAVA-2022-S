class Animal {
	protected int head = 1;
	
	public void speak() {
		System.out.println("Woo Woo");
	}
}

class Bird extends Animal {
	protected int wing = 2;
	
	public void fly() {		
		System.out.println("flying");
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Goo Goo");
	}	
}

class Dog extends Animal {
	protected int leg = 3;
	
	public void walk() {
		System.out.println("walking");
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Wal Wal");
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ob1;
		ob1 = new Animal();
		System.out.println(ob1.head);
		ob1.speak();
		
		Bird ob2;
		ob2 = new Bird();
		ob2.fly();
		ob2.speak();
		
		Dog ob3;
		ob3 = new Dog();
		ob3.walk();
		ob3.speak();
		
		Animal ob; // 객체 참조변수는 상위 클래스로 정의
		ob = new Bird();
		// ob.wing; (X)
		ob.speak();
		
		// 객체 참조변수가 어떤 객체를 할당받았는지 확인하는 방법
		// instanceof 연산자
		
		if(ob instanceof Bird)
			System.out.println("bird object");
		else if(ob instanceof Dog)
			System.out.println("dog object");		
		
		ob = new Dog();
		// ob.leg; // (X)
		ob.speak();
		
		if(ob instanceof Bird)
			System.out.println("bird object");
		else if(ob instanceof Dog)
			System.out.println("dog object");
		
		// 상속관계에서 상위 클래스의 객체 참조변수는
		// 하위의 어떤 객체를 할당 받느냐에 따라
		// 하위 클래스에서 오버라이딩을 한 메서드를 호출할 수 있다	
	}
}
