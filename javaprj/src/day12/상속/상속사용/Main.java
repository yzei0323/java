package day12.상속.상속사용;

public class Main {
	
	public static void main( String[] args  ) {
		
		Student s = new Student();
		
		s.걷기();
		s.공부하기();
		
		StudentWorker sw = new StudentWorker();
		
		sw.걷기();
		sw.공부하기();
		
		Researcher r = new Researcher();
		r.걷기();
		r.잠자기();
		r.연구하기();
		
		Professor p = new Professor();
		p.걷기();
		p.잠자기();
		p.연구하기();
		p.가르치기();
	}

}
