package loop.quiz;

public class Quiz9 {

	public static void main(String[] args) {
		
		// 중첩 반복문을 사용해서 직사각형을 그려보세요
		// 가로 : 5 세로 : 3
		
		for (int i = 1; i <= 3; i++ ) { // 세로
			for(int j = 1; j <= 5; j++) { // 가로
				System.out.print("*");
			}
			System.out.println();
		}
	
//		*
//		**
//		***
//		****
//		*****
//		for(int i = 1; i<= 5; i++) {
//			for(int j = 1; j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		*
//	   ***
//	  *****
//	 *******
//	*********
//		for(int i = 1; i<=5; i++) {
//			for(int j = 5; j <=i; j-=2) {
//				System.out.print("");
//			}
//			System.out.println();
//		}
	}

}
