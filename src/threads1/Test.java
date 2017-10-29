package threads1;

public final class Test {

	public static void main(String[] args) {

	/**
	se intenta demostrar atravez de una funcion que manda como parametro el inicio de un contador for que sera ejecutado tres
	veces en paralelo empleando tres Threads de Java
		
	 * 
	 */

		inicio(0);
		
		inicio(3);
		
		inicio(6);

	}

	private static void inicio(int num) {

		For n = new For(num);
		
		System.out.println("----->" + n.getNumero());

 //  Por la api de java de que 
		//tengo que crear un objeto del tipo Runnable con la instancia d ela clase que lo implementa
		//luego se crea un objeto del tipo Thread al cual se le pasa por paramento a su constructor el objeto del tipo Runnable		
		//se instancia al objeto con el metodo start() que ejecuta el metodo run() 
		//(En este caso el metodo esta en la clase ForThreads)
 
		Runnable r = new ForThreads(n);
		
		Thread t = new Thread(r);
		
		t.start();
		
	}

}
