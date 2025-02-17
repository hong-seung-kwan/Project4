package loop.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		// 1부터 100까지 더해주세요
		// 중간에 합이 500을 넘어가면 중단해주세요
		// 그리고 마지막으로 더한 숫자와 합계를 출력해주세요

		int sum = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			sum = sum + i;
			if(sum > 500) {
				break;
			}
		}
		System.out.println("더한 숫자: " + i + ", 합계 : " + sum);
	
		
//		int sum = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(sum > 500) {
//				break;
//			}
//			sum = sum + i;
//			System.out.println("더한 숫자: " + i + ", 합계 : " + sum);
//		}
	}
}
