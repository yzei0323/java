package day05.practice;

public class 배열실습3_2 {

	public static void main(String[] args) {
		
		//3. 응용배열문제
		
		//2) 배열의 평균값보다 큰 요소의 개수 구하기
		// int[] Temperatures = { 33,35,32,35,36,35,34 };

		
		int[] Temperatures= {33,35,32,35,36,35,34};
		int sum=0;
		int avg=0;
		int cnt=0;
		
		for(int i=0; i<Temperatures.length; i++) {
			sum+=Temperatures[i];
		}
		avg=sum/Temperatures.length;
		System.out.println("평균값: "+avg);
		
		for(int i=0; i<Temperatures.length; i++) {
			if(Temperatures[i]>avg) {
				cnt++;
			}
		}
		System.out.println("배열의 평균값보다 큰 요소의 개수는 "+cnt+"개 입니다.");
	}

}
