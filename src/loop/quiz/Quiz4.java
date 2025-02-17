package loop.quiz;

public class Quiz4 {

	public static void main(String[] args) {

		// 반복문을 사용하여 1~100까지 출력하기
		// 1~100 중에서 짝수만 출력하세요 (짝수만이니까 조건문 사용)

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // i의 나머지값이 0이면 짝수
				System.out.println(i);
			}
		}

//		for(int i = 2; i <= 100; i+=2) {
//			
//			System.out.println(i);
//			
//		}	
	}

}
