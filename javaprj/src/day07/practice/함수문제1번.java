package day07.practice;

public class 함수문제1번 {

	public static void main(String[] args) {
		
		//1. 수배열을 매개변수로 짝수의 개수를 반환하는 함수를 만들기
		int[] nums = new int[] {1,23,65,4,52,16,32};
		
		int cnt=짝수개수(nums);
		System.out.println(cnt);
		
	}

	
	public static int 짝수개수(int[] nums) {
		int cnt=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) { 
				cnt++;
			}
		}
		return cnt;
	}
}
