package Logica;

public abstract class Conversor {
	protected double dato1;
	protected String dato2;

	public Conversor(double dato1, String dato2) {
		this.dato1 = dato1;
		this.dato2= dato2;
	}
	public abstract double calcularConversion();
}
