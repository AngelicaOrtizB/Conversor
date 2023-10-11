package Logica;

public class ConversorTemperatura extends Conversor {

	public ConversorTemperatura(double dato1, String dato2) {
		super(dato1, dato2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularConversion() {
		// TODO Auto-generated method stub
		if (dato2== "celsius") {
			return this.dato1+ 273.15;
		}
		else {
		return this.dato1-273.15;
		}
	}

}
