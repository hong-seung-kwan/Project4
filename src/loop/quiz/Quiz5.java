package loop.quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		// continue를 사용해서,
		// 1부터 100까지의 수 중에서 3의 배수만 출력하세요.
		// 3 6 9 ...
		
		// 생략..?
		// 1-> 생략
		// 2-> 생략
		// 3-> 출력
		// 4-> 생략
		
		
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 != 0) { // i가 3의 배수가 아닐때
				continue;
			}
			System.out.println(i);
		}
	}

}