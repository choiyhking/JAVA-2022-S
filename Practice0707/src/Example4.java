
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	
	public static void test1() {
		// 배열(array): '데이터 타입이 같은' 여러 개의 데이터를 하나로 관리하기 위한 방법
		// 메모리 공간을 연속으로 할당
		// 자바에서 배열은 객체이다(속성과 메서드 존재)
		
		// 'int[]'가 클래스 느낌
		// 정의하면서 직접 초기화
		int[] score = {10, 20, 30, 40, 50};
		
		System.out.println(score.length); // 배열의 길이(요소의 개수)
		System.out.println(score[3]); // 요소의 접근
		score[3] = 60; // 요소 변경
		System.out.println(score[3]);
		
		// 초기화를 하지 않는 경우
		int[] grade = new int[5]; // 객체를 생성하여 배열 정의
		grade[0] = 90;
		grade[1] = 80;
		
		System.out.println(grade[3]); // 초기화 하지 않은 요소는 자동 0
		
		// 배열 요소를 모두 출력
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
