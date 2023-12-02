package prova2;

public class Retangulo extends Forma{
	private double comprimento;
	private double largura;
	
	public Retangulo(double comprimento, double largura) {
		super();
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	@Override
	double calcularArea() throws ValorNegativo{
		if(getComprimento() < 0 || getLargura() < 0){
			throw new ValorNegativo();
		}else{
		return comprimento*largura;
		}
	}
	
	

}
