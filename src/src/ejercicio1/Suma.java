package ejercicio1;

public class Suma extends Operacion{

	public Suma(int numero1, int numero2) {
		this.num1 = numero1;
		this.num2 = numero2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcular() {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

}
