package day16.prac.exception;

public class Ex02 {

	public static void main(String[] args) {
		
		
		//unchecked exception
		//try~catch로 예외를 처리해보자
		
		int[] arr = new int[] {10,20,30,40};
		
		try {
			//예외가 발생할 수 있는 코드
			//예외가 발생되면 예외객체가 생성된다!!
		
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			System.out.println("===== 코드 수행");
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			//e.printStackTrace();
		
		}
		
		System.out.println("프로그램 종료");
	}

}
