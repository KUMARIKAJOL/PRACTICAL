package kajol.com;

public class Runmethod extends Thread {
	public void run() {
		System.out.println("Thread activated");
	}
	public static void main(String[] args) {
		Runmethod r1 = new Runmethod();
		r1.run();
		r1.setName("kajol");
		String s = r1.getName();
		System.out.println(s);
	}

}
