
class DateSample { // 날짜정보(이런 클래스 없어서 만듦)
	private int year, month, day;

	// 기본 생성자
	// 일반 생성자가 있으면 자동으로 생성되지 않는다
	// 따라서 필요하면(new DateSample() 쓸 경우) 직접 정의해야 함(껍데기라도)
	public DateSample() {
		
	}
	
	// 일반 생성자
	public DateSample(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String getDate() {
		return String.format("%d-%02d-%02d", year, month, day);
	}
}

class Patients {
	private String name;
	
	// 클래스가 속성
	private DateSample admission; // 입원 날짜
	private DateSample discharge; // 퇴원 날짜
	
	public Patients(String name, DateSample admission, DateSample discharge) {
		this.name = name;
		this.admission = admission;
		this.discharge = discharge;
	}
	
	public String getPatients() {
		String message = "";
		
		message += String.format("Name: %s\n", name);
		message += String.format("In: %s\n", admission.getDate());
		message += String.format("Out: %s", discharge.getDate());
	
		return message;
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateSample ob = new DateSample(2019, 5, 30);
		System.out.println(ob.getDate());
		
		DateSample admin = new DateSample(2010, 5, 30);
		DateSample discharge = new DateSample(2012, 12, 3);
		Patients man = new Patients("Kim", admin, discharge);
		
		System.out.println(man.getPatients());
	}

}
