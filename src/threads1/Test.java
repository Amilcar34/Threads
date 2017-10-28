package threads1;

public final class Test {

	public static void main(String[] args) {

	
		inicio(0);
		
		inicio(3);
		
		inicio(6);

	}

	private static void inicio(int num) {
		
		For n = new For(num);
		
		System.out.println("----->" + n.getNumero());
		
		Runnable r = new ForThreads(n);
		
		Thread t = new Thread(r);
		
		t.start();
		
	}

}
