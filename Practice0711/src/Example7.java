class Timedisplay {
	private int hour;
	private int min;
	private int sec;
	
	// hour: 0~24, min: 0~60, sec: 0~60
	public void setHour(int _hour) {
		if(_hour >= 0 && _hour < 24) { 
			hour = _hour;
		}
		else {
			System.out.println("Hour error");
			System.exit(1);
		}
	}
	
	public void setMin(int _min) {
		if(_min >= 0 && _min < 60) { 
			min = _min;
		}
		else {
			System.out.println("Minute error");
			System.exit(1);
		}
	}
	
	public void setSec(int _sec) {
		if(_sec >= 0 && _sec < 60) { 
			sec = _sec;
		}
		else {
			System.out.println("Second error");
			System.exit(1);
		}
	}
	
	public void setTime(int _hour, int _sec, int _min) {
		setHour(_hour);
		setMin(_min);
		setSec(_sec);
	}
	
	public String getUniversalTime() {
		String message = String.format("%02d:%02d:%02d", hour, min, sec);
		
		return message;
	}
	
	public String getStandardTime() {
		int h;
		
		if(hour == 0 || hour == 12)
			h = 12;
		else
			h = hour % 12;
		
		String apm;
		if(hour < 12) apm = "AM";
		else apm = "PM";
		
		return String.format("%02d:%02d:%02d %s", h, min, sec, apm);
	}
}

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timedisplay ob = new Timedisplay();
		ob.setTime(15, 40, 37);
		System.out.println(ob.getUniversalTime());
		System.out.println(ob.getStandardTime());
	}

}
