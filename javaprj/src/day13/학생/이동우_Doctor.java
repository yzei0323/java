package day13.학생;

public class 이동우_Doctor extends 이동우_Person{

	public 이동우_Doctor(String name) {
		super(name);
	}
	
	 @Override
	public void personInfo() {

		System.out.println(name + "의 역할은 환자를 치료하는 일이다.");
	}
}
