package day05.practice;

public class 배열실습2 {

	public static void main(String[] args) {
		
		//2. 기본배열문제
		// 이번주 날씨 정보가 배열로 제공되었다.
		// int[] Temperatures = {33, 35, 32, 35, 36, 35, 34};
		
		//1) 이번주 날씨정보를 출력하시오
		
		int[] Temperatures = {33, 35, 32, 35, 36, 35, 34};
		
		System.out.print("이번주 온도는 ");
		for(int i=0; i<Temperatures.length-1; i++) {
			System.out.print(Temperatures[i]+"도, ");	
		}
		System.out.println(Temperatures[6]+"도 입니다.");
		
		
		//2) 평균온도를 구하시오
		int avg=0;
		int sum=0;
		for(int i=0; i<Temperatures.length; i++) {
			sum+=Temperatures[i];
		}
		avg=sum/Temperatures.length;
		System.out.println("이번주 평균온도는 "+avg+"도 입니다.");

		
		//3) 35도가 넘는 날의 횟수를 구하시오
		int cnt=0;
		for(int i=0; i<Temperatures.length; i++) {
			if(Temperatures[i]>35) {
				cnt++;
			}
		}
		System.out.println("이번주에 35도가 넘는 날이 "+cnt+"일 있습니다.");
		
		
		//4) 가장 높은 온도를 구하시오
		int max=Temperatures[0];
		for(int i=0; i<Temperatures.length; i++) {
			if(Temperatures[i]>max) {
				max=Temperatures[i];
			}
		}
		System.out.println("이번주 최고온도는 "+max+"도 입니다.");
	}

}
