package day03.practice;

import java.util.Scanner;

public class 순한맛5번 {

	public static void main(String[] args) {
		
		//1000개의 수를 읽어 평균을 계산하여 합과 평균을 출력
		//그니까 입력을 받아야되는거잖아

		int input;
		int n=1;
		int sum=0;
		int avg=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(n<=10) {
			input = sc.nextInt();
			sum+=input;
			n++;
		}
		avg=sum/10;
		System.out.println(sum);
		System.out.println(avg);
	}
}
