package threads1;

//Por la api de java se sabe que tengo que crear una Clase que implemente la Interfaz Runnable
//La cual me obliga a sobreescribir el metodo run() que sera el encargado de ejecutarse en cada
//instancia de un objeto del tipo Thread

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
