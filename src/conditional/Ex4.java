package conditional;

// switch문
public class Ex4 {

	public static void main(String[] args) {

		int rank = 5; // 선수의 등수

//		switch (변수) {
//			경우의수(조건)
//		}

		switch (rank) {
		case 1: // rank == 1
			System.out.println("금메달");
			break;
		case 2: // rank == 2
			System.out.println("은메달");
			break;
		case 3: // rank == 3
			System.out.println("동메달");
			break;
		default:
			System.out.println("메달이 없습니다");
		}

	}

}
