package day12.상속.업캐스팅다운캐스팅;

public class 객체배열 {

	public static void main(String[] args) {
		
		
		//상속관계에서 업캐스팅이 지원되기 때문에 type이 다른 자식들을 부모형 타입의 배열로 다룰 수 있다
		
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		/*
		 Cat c = new Cat();
		 Animal a1 = c;
		 
		 Dog d = new Dog();
		 Animal a2 = d;
		
		
		Animal[] list = new Animal[2];
		list[0]=a1;
		list[1]=a2;
		
		for(int i=0; i<list.length; i++) {
			list[i].짖다();
		}
		*/
		
		
		
		/// 업캐스팅과 다운캐스팅에서 중요한 것은 new된 실제이다
		/// 과일 <--포도	업캐스팅
		/// 포도를 과일로 부른경우 그 과일을 다시 포도로 부를 수 있는 것이다 !! 너무 당연한 것!!
		/// 과일 --> 포도 다운태스팅
		///
		
		
		//각 객체의 고유의 기능을 쓰고 싶다면
		//다운캐스팅을 해야함
		
		
		System.out.println("===============");
		for(int i=0; i<list.length; i++) {
			list[i].짖다();
			
			//cat 객체인지 확인후
			//Cat 형변환 시킨다음
			//Cat의 고유의 기능을 
		}
		
		if(list[i] instanceof Cat) {
			Cat temp = (Cat )
		}
		
		
		Animal[] arr = new Animal[2];
		arr[0] = new Cat();
		arr[1] = new Dog();
		
	
	}

}
