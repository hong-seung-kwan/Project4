package conditional;

public class Ex6 {

	public static void main(String[] args) {
		
		// 선수의 등수
		String rank = "1";
		
		switch(rank) {
		
			case "1": //rank == 1 / string == string !!
				System.out.println("금메달");
				break;
			case "2":
				System.out.println("은메달");
				break;
			case "3":
				System.out.println("동메달");
				break;
			default :
				System.out.println("메달이 없습니다");
		}
		
		// switch의 제약조건 : 실수는 사용불가.
//		float f = 1.4f;		
//		switch(f) {
//			case 1.4f:
//				break;
//		}
		
	}

}
