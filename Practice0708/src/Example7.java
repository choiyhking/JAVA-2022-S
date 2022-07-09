// 입출금 계좌 클래스
class Account {
	String name;
	int balance; // 잔액
	
	public void deposit(int money) { // 입금
		balance += money;
	}
	
	public void withdraw(int money) { // 출금
		balance -= money;
	}
	
	public void display() { // 잔액 조회
		System.out.println("balance: " + balance);
	}
}

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}

	public static void test1() {
		Account my = new Account();
		my.display();
		
		my.deposit(10000);
		my.display();
		
		my.withdraw(4000);
		my.display();
	}
}
