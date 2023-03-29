package kajol.com;

 class Sthread_Test{
	 synchronized void display(int num) {
		 for(int i=1;i<5;i++) {
				System.out.println(num*i);
				try {
					Thread.sleep(500);
				}catch (Exception e) {
					System.out.println(e);
				}}}}
public class Synchronized_EG2 { //main class
	public static void main(String[] args) {
		Sthread_Test obj = new Sthread_Test();
		// 1st thread object t1
		Thread t1 = new Thread() {
			public void show() {
				obj.display(5);
				
	}
		};
		t1.start();
		t1.start();
		
		 }
}

