package threads1;

public final class ForThreads implements Runnable {

	private For f;

	public ForThreads(For fo) {
		this.f = fo;
	}

	@Override
	public void run() {

		System.out.println("-->" + f.getNumero());
		
		for (int j = f.getNumero(); j < 8; j++) {

			try {
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {}
			
			System.out.println(j);
		}
	}

}
