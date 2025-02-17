package loop;

// while문
public class Ex2 {

	public static void main(String[] args) {
				
		int num = 1; // 초기화
		
		while(num<=10) { // num이 1부터 10이 될때까지 10번 반복
			// 반복적으로 실행할 코드
			System.out.println(num); // 1~10 바뀌는 변수
			num++;
		}
		// 증감식의 용도:
		// num의 값이 1로 유지되면서 계속 조건을 만족하고
		// 무한루프에 빠짐!

	}

}
