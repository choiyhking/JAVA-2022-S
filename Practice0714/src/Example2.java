// Employee (직원 관리)
interface Employee {
	double COMMISSION = 0.2; // 커미션
	int HOUR_SALARY = 30000; // 시간당 금액
	int BONUS = 1000000;
	
	int getBaseSalary(); // 기본급여 계산
	double computeEaring();	// 실제급여 계산
}

// 공통항목에 대한 상위 클래스 작성
class BaseEmployee {
	private String name; // 직원 이름
	private int baseSalary; // 기본 급여
	
	public BaseEmployee(String name, int baseSalary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	// private 속성을 사용하기 위한 getter 메서드 
	public String getName() {
		// 이름 정보에 추가 정보를 삽입할 수도 있다.
		return this.name;
	}
	
	public int getBaseSalary() {
		// 기본 급여에 대한 추가 계산		
		return this.baseSalary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = String.format("name : %s\n", this.getName());
		message += String.format("base salary : %d", this.getBaseSalary());
		return message;
	}
}

class RegularEmployee extends BaseEmployee implements Employee {
	private int sales; // 판매금액
	
	public RegularEmployee(String name, int baseSalary, int sales) {
		// TODO Auto-generated constructor stub
		super(name, baseSalary);
		this.sales = sales;
	}
	
	public int getSales() {
		// 판매금액에 대한 추가 정보 계산
		return this.sales;
	}
	
	@Override
	public int getBaseSalary() {
		// TODO Auto-generated method stub
		return super.getBaseSalary() + BONUS;
	}
	
	@Override
	public double computeEaring() {
		// TODO Auto-generated method stub		
		return this.getBaseSalary() + (getSales() * COMMISSION);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = super.toString() + "\n";
		message += String.format("sales : %d\n", this.getSales());
		message += String.format("total salary : %.1f", this.computeEaring());
		return message;
	}	
}

class HourEmployee extends BaseEmployee implements Employee {
	private int hour;
	
	public HourEmployee(String name, int baseSalary, int hour) {
		// TODO Auto-generated constructor stub
		super(name, baseSalary);
		this.hour = hour;
	}
	
	public int getHour() {
		// 근무 시간에 대한 추가 정보 계산
		return this.hour;
	}
	
	@Override
	public int getBaseSalary() {
		// TODO Auto-generated method stub
		return super.getBaseSalary();
	}
	
	@Override
	public double computeEaring() {
		// TODO Auto-generated method stub		
		return this.getBaseSalary() + (this.getHour() * HOUR_SALARY);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = super.toString() + "\n";
		message += String.format("hour : %d\n", this.getHour());
		message += String.format("total salary : %.1f", this.computeEaring());
		return message;
	}	
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] person = new Employee[3];
		person[0] = new RegularEmployee("hong", 3000000, 1500000);
		person[1] = new HourEmployee("kim", 1000000, 50);
		person[2] = new RegularEmployee("park", 5000000, 10000000);

		for(Employee p : person) {
			if(p instanceof RegularEmployee)
				System.out.println("Regular Employee");
			if(p instanceof HourEmployee)
				System.out.println("Hour Employee");			
			
			System.out.println(p);
			System.out.println("---------------------------");
		}		
	}
	
	public static void test1() {
		BaseEmployee man = new BaseEmployee("hong", 3000000);
		System.out.println(man);
	}
	
	public static void test2() {
		RegularEmployee man = new RegularEmployee("hong", 3000000, 1500000);
		System.out.println(man);
	}
	
	public static void test3() {
		HourEmployee man = new HourEmployee("kim", 1000000, 50);
		System.out.println(man);
	}
}
