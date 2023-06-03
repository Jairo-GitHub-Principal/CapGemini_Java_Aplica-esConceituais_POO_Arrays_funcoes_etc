package Threads;

public class ThreadsTest {

	static int i = 0;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		new Thread(t1).start();
		new Thread(t2).start();

	}
	
	private static void contador(String name) {
		i++;
		System.out.println("O valor do contador atual é: "+ i +" thread: " + name );
	}
	
	private static Runnable t1 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				for(int i=0;i<5;i++) {
					contador("t1");
				}
			}catch(Exception e) {}
			
		}
	};
	
	private static Runnable t2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				for (int i = 0; i < 5; i++) {
					contador("t2");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	};

}
