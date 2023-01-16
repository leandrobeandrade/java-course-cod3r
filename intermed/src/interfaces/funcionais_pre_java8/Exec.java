package interfaces.funcionais_pre_java8;

public class Exec {

	public static void main(String[] args) {
		Runnable trabalho1 = new Trabalho();
		Runnable trabalho2 = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Trabalho #2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Runnable trabalho3 = Exec::trabalho3;
		
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	static void trabalho3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Trabalho #3");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
