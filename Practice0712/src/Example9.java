class Megazine {
	private int art;
	private int sports;
	
	public Megazine(int art, int sports) {
		this.art = art;
		this.sports = sports;
	}
	
	public void displayMegazine() {
		System.out.printf("Art: %d, Sports: %d\n", art, sports);
	}
}

class Sample extends Megazine {
	private int poem;
	private int comic;
	
	public Sample(int art, int sports, int poem, int comic) {
		super(art, sports); // 부모의 생성자를 내가 직접 호출
		// 반드시 생성자에서 맨 위에 기술해야 한다
		
		this.poem = poem;
		this.comic = comic;
	}
	
	/*
	 * <생성자 호출 순서>
	 * 1. 하위 클래스 생성자 호출
	 * 2. 상위 클래스 생성자 호출
	 *    이때 따로 super()로 생성자 지정해주지 않으면 상위 클래스의 기본 생성자를 호출해야 함
	 *    But 상위 클래스에 일반 생성자가 있으면 기본 생성자는 만들어지지 않음 -> 오류 발생
	 *    그래서 하위 클래스 생성자 내부에서 super()로 직접 상위 클래스의 호출할 생성자를 지정해줘야 함
	 * 3. 상위 클래스 생성자 내용 실행
	 * 4. 하위 클래스 생성자 내용 실행 
	 */
	
	public void displaySample() {
		super.displayMegazine();
		System.out.printf("Poem: %d, Comic: %d\n", this.poem, this.comic);
	}
}

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample ob = new Sample(10, 3, 4, 2);
		ob.displaySample();
	}

}
