package prova2;

public class Quadrado extends Forma{
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	double calcularArea() throws ValorNegativo {
		if(getLado() <0){
			throw new ValorNegativo();
		} else{
			return Math.pow(getLado(), 2);
		}
	}
	
	

}
