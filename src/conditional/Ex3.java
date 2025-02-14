package conditional;

// if문
public class Ex3 {

	public static void main(String[] args) {
		
		// 나이에 따라 다른 문장 출력하기
		// 8살 미만이면 아동
		// 8살이상 14살미만이면 초등학생
		// 14살이상 20살미만이면 중,고등학생
		// 모두 아니라면 성인
		
		int age = 25;
		
		if (age<8) { 
			System.out.println("아동입니다");
		} else if(age<14) { 
			System.out.println("초등학생입니다");
		} else if(age<20) { 
			System.out.println("중,고등학생입니다");
		} else {
			System.out.println("성인입니다");
		}

	}

}
