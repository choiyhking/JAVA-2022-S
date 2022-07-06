import java.util.Scanner;

// 게임 메뉴
class Game {
	int menu;
	
	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. New Game");
			System.out.println("2. Load Game");
			System.out.println("3. Save Game");
			System.out.println("4. Exit Game");
			System.out.print("Select: ");
			
			menu = sc.nextInt();
			messageMenu();
		} while(menu != 4);
	}
	
	public void messageMenu() {
		switch(menu) {
		case 1:
			System.out.println("Starting!");
			break;
		case 2:
			System.out.println("Loading!");
			break;
		case 3:
			System.out.println("Saving!");
			break;
		case 4:
			System.out.println("End!");
			break;
		default:
			System.out.println("Wrong input!");	
		}
		System.out.println();
	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game ob = new Game();
		ob.displayMenu();
	}

}
