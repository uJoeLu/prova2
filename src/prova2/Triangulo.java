package prova2;

public class Triangulo extends Forma {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	double calcularArea() throws ValorNegativo {
		if (getBase() < 0 || getAltura() < 0) {
			throw new ValorNegativo();
		} else {
			return (base * altura) / 2;
		}
	}

}
