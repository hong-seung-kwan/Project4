package loop;

// for문 break
public class Ex9 {

	public static void main(String[] args) {
		
		// 1부터 20까지 더하다가, 합이 100을 넘어가면 중단
		
		int sum = 0; // 합계를 저장할 변수
		
		for(int i = 1; i <= 20; i++) {
			if(sum > 100) {
				break;
			}
			sum = sum + i;
			System.out.println("sum: " + sum + " , i: "+ i);
		}
		System.out.println("1~20 합계: " + sum);
	}

}
