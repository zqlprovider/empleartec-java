package ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacion op = new Suma (7,3);
		
		System.out.println(op.calcular());
		
		op = new Resta (8,4);
		
		System.out.println(op.calcular());
		

	}

}
