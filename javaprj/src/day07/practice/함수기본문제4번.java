package day07.practice;

public class 함수기본문제4번 {

	public static void main(String[] args) {
		
		// 4. 이번주 예상 로또번호를 반환하는 함수 만들기
		
		int[] lotto = 이번주로또();

		for(int result : lotto) {
			System.out.println(result);	
		}
		
		//함수
		//입력 X
		//반환 O
	}

	public static int[] 이번주로또() {
		int[] lotto = {12, 33, 25, 1, 9, 29};
		
		return lotto;
	}
}
