interface Test1<T> {
	int MAX = 10;
	public void insert(T number);
	public T delete();
}

class DataList<T> {
	public T[] data;
	public int count; // 리스트의 요소 개수
	
	public DataList(T[] data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("List = [");
		for(int index = 0; index < count; index++) {
			System.out.print(data[index]);
			if(index < count - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}	
}

class StackList<T> extends DataList<T> implements Test1<T> {
	
	public StackList(T[] data) {
		// TODO Auto-generated constructor stub
		super(data);
	}
	
	@Override
	public void insert(T number) {
		// TODO Auto-generated method stub
		if(count == MAX)
			System.out.println("list full");
		else {
			System.out.println("insert item : " + number);
			data[count] = number;
			count++;
		}			
	}
	
	@Override
	public T delete() {
		// TODO Auto-generated method stub
		T item = null;
		if(count == 0)
			System.out.println("list empty");
		else {
			System.out.print("delete item : ");
			item = data[count-1];
			count--;
		}
		return item;
	}
}

class QueueList<T> extends DataList<T> implements Test1<T> {
	
	public QueueList(T[] data) {
		// TODO Auto-generated constructor stub
		super(data);
	}
	
	@Override
	public void insert(T number) {
		// TODO Auto-generated method stub
		if(count == MAX)
			System.out.println("list full");
		else {
			System.out.println("insert item : " + number);
			data[count] = number;
			count++;
		}
	}
	
	@Override
	public T delete() {
		// TODO Auto-generated method stub
		T item = null;
		if(count == 0)
			System.out.println("list empty");
		else {
			System.out.print("delete item : ");
			item = data[0];
			for(int index = 1; index < count; index++) {
				data[index-1] = data[index];
			}
			count--;
		}
		return item;
	}
}


public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4();
	}
	
	public static void test1() {
		Integer[] data = {10, 20, 30, 40, 50, 60};
		DataList<Integer> ob = new DataList<>(data);
		ob.display();
	}
	
	public static void test2() {
		Integer[] data = new Integer[10];
		StackList<Integer> ob = new StackList<>(data);
		ob.insert(10);
		ob.insert(20);
		ob.insert(30);		
		ob.display();
		System.out.println(ob.delete());
		ob.display();
		ob.insert(40);
		ob.insert(50);
		System.out.println(ob.delete());
		ob.display();
	}
	
	public static void test3() {
		Double[] data = new Double[10];
		QueueList<Double> ob = new QueueList<>(data);
		ob.insert(10.1);
		ob.insert(20.3);
		ob.insert(30.5);		
		ob.display();
		System.out.println(ob.delete());
		ob.display();
		System.out.println(ob.delete());
		ob.display();
		ob.insert(10.4);
		ob.insert(20.9);
		ob.display();
	}
	
	public static void test4() {
		String[] data = new String[10];
		QueueList<String> ob = new QueueList<>(data);
		ob.insert("kim");
		ob.insert("lee");
		ob.insert("kang");		
		ob.display();
		System.out.println(ob.delete());
		ob.display();
		System.out.println(ob.delete());
		ob.display();
		ob.insert("park");
		ob.insert("oh");
		ob.display();
	}
}
