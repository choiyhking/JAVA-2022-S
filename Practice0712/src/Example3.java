// 동적으로 할당 받은 메모리는 해제 해줘야함
// JVM의 가비지 컬렉션 -> 자동으로 사용되지 않는 메모리 없애 줌
// 직접 제어도 할 수 있음
// c++의 소멸자 같은 것 필요 없음

class Box {
	private int width, height, depth, volume;
	public static int boxID;
	
	// 생성자
	public Box(int width, int height, int depth) {
		this.boxID++;
		
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	private void computeVolume() {
		this.volume = this.width * this.height * this.depth;
	}
	
	public String getBox() {
		computeVolume();
		
		String msg = "";
		msg += String.format("ID: %d, ", boxID);
		msg += String.format("Volume: %d", volume);
		
		return msg;
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box bx1 = new Box(10, 20, 30);
		System.out.println(bx1.getBox());
		
		Box bx2 = new Box(5, 10, 7);
		System.out.println(bx2.getBox());
		
		Box bx3 = new Box(20, 10, 40);
		System.out.println(bx3.getBox());
	}

}
