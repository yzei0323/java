package day05.practice;

import java.util.Scanner;

public class 배열실습3_1 {

	public static void main(String[] args) {
		
		//3. 응용배열문제
		// 배열의 크기는 10으로 한다. 수는 10개 이내로 입력
		
		//1) 수가 입력될 때 짝수만 배열에 담고 출력하기(0이 입력되면 종료)
		int[] Nums = new int[10];
		int index=0;
		int input;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			input=sc.nextInt();

			//짝수 담기
			if(input%2==0) {
				Nums[index]=input;
				index++;
			}
			
			//0 입력하면 종료
			if(input==0) {
				break;
			}	
		}
		for(int i=0; i<index; i++) {
			System.out.println(Nums[i]);
		}
	}

}
