package Logica;

public class ConversorPeso extends Conversor {

	public ConversorPeso(double dato1, String dato2) {
		super(dato1, dato2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularConversion() {
		// TODO Auto-generated method stub
		if (dato2== "Kilogramo") {
			return this.dato1/1000;
		}
		else {
		return this.dato1*1000;
		}
		}
		
}


