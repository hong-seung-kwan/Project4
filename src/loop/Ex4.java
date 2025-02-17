package loop;

// do while문
public class Ex4 {

	public static void main(String[] args) {
		
		int num = 11; // 초기화
		
		// do~while은 무조건 한번 블록을 실행
		do {
			System.out.println(num);
			num++;
		} while(num<=10); // 마지막에 조건식 작성

	}

}
