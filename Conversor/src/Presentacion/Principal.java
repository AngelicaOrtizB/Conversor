package Presentacion;
import Logica.Conversor;
import Logica.ConversorLongitud;
import Logica.ConversorPeso;
import Logica.ConversorTemperatura;

public class Principal {

	public Principal() {
		Conversor c;
		c= new ConversorLongitud(10, "metros");
		System.out.println(c.calcularConversion());
		c= new ConversorPeso(10, "kilogramos");
		System.out.println(c.calcularConversion());
		c= new ConversorTemperatura(10, "celsius");
		System.out.println(c.calcularConversion());

		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		new Principal();
	}

}
