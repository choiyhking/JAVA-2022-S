class Grade {
	int[] score;
	
	// using enhanced for loop
	public int getSum() {
		int sum = 0;
		
		for(int s : score) {
			sum += s;
		}
		
		return sum;
	}
	
	public int getMax() {
		int max = score[0];
		
		for(int s : score) {
			if(max < s)
				max = s;
		}
		
		return max;
	}
	
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade ob = new Grade();
		
		// ob.score = {96, 78 56, 88, 94}; (X) -> score는 참조변수 이므로
		int[] a = {96, 78, 56, 88, 94};
		ob.score = a; 
		
		System.out.println(ob.getSum());
		System.out.println(ob.getMax());
	}

}
