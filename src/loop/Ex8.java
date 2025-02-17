package loop;

// for문 continue
public class Ex8 {

	public static void main(String[] args) {
		
		// 1~10 사이의 짝수들의 합 구하기
		
		int sum = 0; // 합계를 저장할 변수
		
		for(int i = 1; i <= 10; i++) {
			// i가 홀수라면 생략
			// 그렇지 않으면 계산
			if(i%2==1) {
				continue;				
			}
			sum = sum + i;
		}
		System.out.println("합계는 "+ sum);
	}

}
