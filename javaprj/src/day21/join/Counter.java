package day21.join;


class Counter   extends Thread   {
	
	
	@Override
	public void run() {
		for(int i=10; i > 0; i--) { 
				 
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(   i  + "!!");
				 		 
		} 
		 
	}
}