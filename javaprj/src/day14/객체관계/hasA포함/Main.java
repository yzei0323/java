package day14.객체관계.hasA포함;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		a.A매서드();
		
		
		C c = new C();
		
		D d = new D();
		c.setD(d);
		
		c.C매서드();
		
		
		
		
	}

}
