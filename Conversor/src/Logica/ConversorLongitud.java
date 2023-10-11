package Logica;

public class ConversorLongitud  extends Conversor{

	public ConversorLongitud(double dato1, String dato2) {
		super(dato1, dato2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularConversion() {
		// TODO Auto-generated method stub
		if(this.dato2== "kilometro") {
			return this.dato1*1000;
		}
		else {
		return this.dato1/1000;
		}
	}


}
