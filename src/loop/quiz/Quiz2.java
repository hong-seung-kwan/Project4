package loop.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 11부터 20까지 합을 구하고 출력하세요
		
		// num의 용도
		// 1. 반복문의 조건
		// 2. 더하는 수
		
		int num = 11;
		int sum = 0;
		
		while(num<=20) { // 11~20 => 총 10번
			sum = sum + num; // 더하는수 : 11 ~ 20 바뀌는 변수
			num++;
		}
		
		System.out.println(sum);

	}

}
