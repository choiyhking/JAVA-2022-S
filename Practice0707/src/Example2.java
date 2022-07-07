import java.util.Scanner;

class Prime {
	int num;
	boolean isPrime = true;
	
	public void inputNum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		check();
	}
	
	public void check() {
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
	}
	
	public void display() {
		if(isPrime == true)
			System.out.println("Prime number");
		else
			System.out.println("Not Prime number");
	}
}


public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime ob = new Prime();
		ob.inputNum();
		ob.display();
	}
	
}
