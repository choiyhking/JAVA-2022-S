class Account {
	private String name;
	private int balance;
	
	// 생성자
	public Account() {
		//this.name = "None";
		//this.balance = 0;
		// 취향 차이
		this("None");
	}
	
	// 생성자 오버로딩
	public Account(String name) {
		//this.name = name;
		//this.balance = 0;
		this(name, 0);
	}
	
	public Account(String name, int balance) {
		//this.name = name;
		//this.balance = balance;
		setAccount(name, balance);
	}
	
	public void setAccount(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		if(money < balance)
			this.balance -= money;
		else {
			System.out.println("Error");
			System.exit(1);
		}
	}
	
	public String getAccount() {
		String message = "";
		
		message += String.format("Name: %s\n", this.name);
		message += String.format("%d won", this.balance);
		
		return message;
	}
}

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ob1 = new Account();
		System.out.println(ob1.getAccount());
		
		Account ob2 = new Account("Hong");
		System.out.println(ob2.getAccount());
		
		Account ob3 = new Account("Kim", 10000);
		System.out.println(ob3.getAccount());
		
		Account[] obs = new Account[3];
		//Account[] obs = {ob1, ob2, ob3};
		obs[0] = ob1;
		obs[1] = ob2;
		obs[2] = ob3;
		
		for(int i=0; i<obs.length; i++) {
			System.out.println(obs[i].getAccount());
		}
	}

}
