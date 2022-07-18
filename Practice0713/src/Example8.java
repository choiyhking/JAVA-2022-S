interface Teachable {
	String JOB = "Professor";
	
	void teach();
}

interface Learnable {
	String JOB = "Student";
	
	void learn();
}

class Teacher implements Teachable {	
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println(JOB);
		System.out.println("Teaching!!!");
	}
}

class Students implements Learnable {	
	@Override
	public void learn() {
		// TODO Auto-generated method stub
		System.out.println(JOB);
		System.out.println("Learning!!!");
	}
}

class Graduate implements Teachable, Learnable {
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		// System.out.println(JOB); // error
		System.out.println("Graduate Teaching!!!");
	}
	
	@Override
	public void learn() {
		// TODO Auto-generated method stub
		System.out.println("Graduate Learning!!!");
	}
}

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teachable man1 = new Teacher();
		man1.teach();
		Learnable man2 = new Students();
		man2.learn();
		
		// 대학원생
		Teachable man3 = new Graduate();
		man3.teach();
		
		Learnable man4 = new Graduate();
		man4.learn();		
	}

}
