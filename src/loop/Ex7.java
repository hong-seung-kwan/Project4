package loop;

// for문
public class Ex7 {

	public static void main(String[] args) {
		
		// for문을 이용하여 1~10까지 합 구하기
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("합계는 " + sum);
	}

}
