package day07.practice;

public class 함수기본문제5번 {

	public static void main(String[] args) {
		
		// 5. 어른판단함수만들기 (나이를 매개변수로 전달받는다)
		
		adult(18);
		adult(27);
	
		//함수
		//입력 O
		//반환 X

	}

	public static void adult(int age) {
		if(age>=20) {
			System.out.println("어른. 어른님.");
		}else {
			System.out.println("애기♡");
		}
	}
}
