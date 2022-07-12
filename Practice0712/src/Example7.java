class Parent {
	public int parent_n = 10;
	
	public void setParent(int pnum) {
		parent_n = pnum;
	}
	
	public void displayParent() {
		System.out.println("Pnumber: " + parent_n);
	}
}

class Child extends Parent {
	public int child_n = 20;
	
	public void setChild(int pnum, int cnum) {
		setParent(pnum);
		child_n = cnum;
	}
	
	public void displayChild() {
		displayParent();
		System.out.println("Cnumber: " + child_n);
	}
}

class Baby extends Child {
	public int baby_n = 30;
	
	public void setBaby(int pnum, int cnum, int bnum) {
		setChild(pnum, cnum);
		this.baby_n = bnum;
	}
	
	public void displayBaby() {
		displayChild();
		System.out.println("Bnumber: " + baby_n);
	}
	
	public int total() {
		return parent_n + child_n + baby_n;
	}
}
 
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baby ob = new Baby();
		//System.out.println(ob.total());
		
		ob.setBaby(100, 200, 300);
		ob.displayBaby();
		System.out.println(ob.total());
	}

}
