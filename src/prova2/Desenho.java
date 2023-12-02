package prova2;

import java.util.List;

public class Desenho {
	private List<Forma> formas;

	public Desenho(List<Forma> formas) {
		super();
		this.formas = formas;
	}

	public List<Forma> getFormas() {
		return formas;
	}

	public void setFormas(List<Forma> formas) {
		this.formas = formas;
	}

	public double calcularAreaTotal() {
		double areaTotal = 0;
		for(Forma forma: formas) {
			try {
				areaTotal += forma.calcularArea();
			} catch (ValorNegativo e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return areaTotal;
	}

}
