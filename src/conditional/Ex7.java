package conditional;

// switch문
public class Ex7 {

	public static void main(String[] args) {
		
		int time = 10;
		
		switch(time) { // 조건(변수)
		case 8: // 비교할값
			System.out.println("출근을 합니다");
			
		case 9: // time == 9
			System.out.println("회의를 합니다");
			
		case 10:
			System.out.println("업무를 합니다");
			
		default:
			System.out.println("외근을 나갑니다");	
		}

	}

}
