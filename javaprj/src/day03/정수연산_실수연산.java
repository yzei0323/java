package day03;

public class 정수연산_실수연산 {

	public static void main(String[] args) {

		
		//정수연산
		//피연산자가 모두 정수라면 => 정수연산 수행 => 결과가 정수가 발생
		//10과 3 모두 정수이므로 정수연산을 수행
		//=> 결과가 정수가 나옴
		//=> 3
		
		// 10/3의 결과가 실수형의 값을 얻어야 된다면
		//두개 중의 한 개를 실수형type으로 변환해야 한다
		
		//3 -> 3.0
		//강제형변환을 사용하여 (double)형으로 변환하여 연산을 수행해야 한다
		double result = 10/3 ; 
		System.out.println(result);
		
		
		double result2 = 10/3.0 ;
		System.out.println(result2);
		
		
		
		int su1=10;
		int su2=3;
		double result3;
		
		
		// 피연산자 중에서 큰값으로 형이 변환함, 둘 다 double형으로 변환됨
		// 실수연산을 수행함
		result3 = su1 / (double)su2;
		
		System.out.println(result3);
		
	}

}
