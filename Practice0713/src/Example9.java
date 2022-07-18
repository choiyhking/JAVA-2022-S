// 인터페이스의 상속
interface Base {
	int a = 10;
	int b = 20;
	void play();
}

interface Extends {
	int c = 30;
	void stop();
}

interface Full extends Base {
	int c = 30;
	void stop();
}

class Sample1 implements Base {
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play");
	}
}

class Sample2 extends Sample1 implements Extends {
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop");
	}
}

class Sample3 implements Full {
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
}


class Sample4 implements Base, Extends {
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
}

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
