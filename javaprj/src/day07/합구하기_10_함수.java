package day07;

public class 합구하기_10_함수 {

	public static void main(String[] args) {
		
		//함수명
		//기능 : 1~10까지의합
		//입력 : X
		//반환 : O
	
		
		//1 2 3 4 5 6 7 8 9 10
		
		getTentotal();
		int result = getTentotal2();
		System.out.println(result);
		
	}

	private static void getTentotal() {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;  //sum=sum+i
		}
		System.out.println(sum);
	}
	
	
		//함수명
		//기능 : 1~10까지의합
		//입력 : X
		//반환 : O
	private static int getTentotal2() {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;  //sum=sum+i
		}
		System.out.println(sum);
		
		return sum;
	}

}
