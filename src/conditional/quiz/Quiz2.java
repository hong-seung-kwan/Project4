package conditional.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		// int형 변수 age를 선언하고 나이를 대입하세요.
		// char형 변수 gender를 선언하고 성별을 F 또는 M을 대입하세요.
		// 나이가 8살 이상이고 성별이 여자라면 "여학생입니다" 출력하세요.
		
		// 나이가 8살 이상이고 성별이 여자라면 (논리곱)
		// 여학생입니다 출력
		
		int age = 10;
		char gender = 'F';
		
		if((age >= 8) && (gender == 'F')) {
			System.out.println("여학생입니다");
		}
		
	}

}
