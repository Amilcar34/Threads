package threads1;

//Por la api de java se sabe que tengo que crear una Clase que implemente la Interfaz Runnable
//La cual me obliga a sobreescribir el metodo run() que sera el encargado de ejecutarse en cada
//instancia de un objeto del tipo Thread

public final class ForThreads extends Thread {

	private For f;

	public ForThreads(For fo) {
		this.f = fo;
	}

	@Override
	public void run() {
		for (int i = f.getNumero(); i < 15; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}


}
