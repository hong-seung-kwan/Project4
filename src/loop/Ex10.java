package loop;

// 이중 for문 구구단
public class Ex10 {

	public static void main(String[] args) {
		
		// 구구단
		for(int dan = 2; dan <= 9; dan++) { // 단
			for(int times = 1; times <= 9; times++) { // 곱하는 수
				System.out.println(dan+"X"+times+"="+dan*times);
			}
			System.out.println();
		}

	}
	// 이중포문을 만들때는 외부포문과 내부포문의 역할을 정확히!
}
