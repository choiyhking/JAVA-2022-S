// 리모컨
interface Remocon {
	int VOLUME = 0; // 인터페이스에서 정의하는 상수
	
	void turnOn();
	void turnOff();
}

class TV implements Remocon {
	private int volume = VOLUME;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV ON");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV OFF");
	}
}

class Audio implements Remocon {
	private int volume = VOLUME + 10;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio ON");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio OFF");
	}
}

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remocon tv = new TV();
		tv.turnOn();
		tv.turnOff();
		
		Remocon audio = new Audio();
		audio.turnOn();
		audio.turnOff();
	}

}
