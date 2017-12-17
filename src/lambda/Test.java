package lambda;

public class Test {

	public static void main(String[] args) {

		inicio(0);
		
		inicio(2);
		
		inicio(4);
		
		inicio(0);
		
		inicio(2);
		
		
	}

	private static void inicio(int j) {
		
		Runnable r = () ->{
			
			int h =j;
			while(h < 15){
				System.out.print(h + " ");
				h++;
			}
			System.out.println();
		};
		
		
		Thread t = new Thread(r);
		
		t.start();		
	}

}
