// 상속: A(상위, 부모, super) 클래스가 가진 속성, 메서드를 모두 그대로 물려받으면서(B(하위, 자식, sub)에게), A에게 없는 것 추가할 수 있다
// 소유의 관계와는 다름. 소유는 가져와서 객체 만들고 처리 해야함...
// 어떨 때 상속관계 설정할까?
// "A(하위) is a B(상위)" e.g. 강아지는 동물이다
// "A(하위) has a B(상위)" e.g. 자동차는 바퀴를 가진다

// 'Dog(하위)' is a 'Animal(상위)' -> 성립 -> 상속으로 설계 가능
// 상속을 하는 클래스 = 상위 클래스 = 부모 클래스 = super class
class Animal {
	public static int head = 1;
	
	public int eye = 2;
	
	public void eating() {
		System.out.println("Eating!");
	}
}

// 상속을 받는 클래스 = 하위 클래스 = 자식 클래스 = sub class
// 하위 클래스에 'extends' 키워드 사용
// 상위 클래스의 속성과 메서드를 물려 받는다
class Dog extends Animal{
	//public int eye = 2;
	public int leg = 4;
	
	/*public void eating() {
		System.out.println("Eating!");
	}*/
	
	public void barking() {
		System.out.println("Barking!");
		System.out.println(Animal.head);
	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상속 관계에서 객체 생성은 하위 클래스 객체를 생성
		Dog happy = new Dog();
		
		System.out.println(happy.eye);
		System.out.println(happy.leg);
		
		happy.eating();
		happy.barking();
		
		// static도 그대로 상속 된다
		System.out.println(Dog.head);
	}

}
