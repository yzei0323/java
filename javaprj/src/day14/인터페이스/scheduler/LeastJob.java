package day14.인터페이스.scheduler;
public class LeastJob implements Scheduler{

	 public void getNextCall() {
	         System.out.println( "상담 전화를 순서대로 대기열에서 가져옵니다");
	 }

	 public void sendCallToAgent() {
	         System.out.println( "현재상담 업무가 없거나 대기가 가장 적은 상담원에게 할당됩니다");
	 }
	}
