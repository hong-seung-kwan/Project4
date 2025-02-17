package loop;

// while문
public class Ex3 {

	public static void main(String[] args) {
		
		// 1~10 합구하기 =>
		int sum = 0; // 합계를 저장할 변수
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3; 
//		sum = sum + 4;
//		sum = sum + 5;
//		sum = sum + 6;
//		sum = sum + 7;
//		sum = sum + 8;
//		sum = sum + 9;
//		sum = sum + 10;
		
		int num = 1; // 초기화
		while(num<=10) { // num이 1~10이 될때까지 10번 반복
			sum = sum + num; // 더하는 수는 1~10 바뀌는 변수
			num++;
		}
		
		System.out.println(sum);
	}

}
