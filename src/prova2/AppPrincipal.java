package prova2;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {

	public static void main(String[] args) {
		List<Desenho> desenhos = new ArrayList<Desenho>();

		Forma forma1 = new Triangulo(-5, 3);
		Forma forma2 = new Retangulo(4, 2);
		Forma forma3 = new Triangulo(5, 3);
		Forma forma4 = new Quadrado(4);

		List<Forma> ds1 = new ArrayList<Forma>();
		List<Forma> ds2 = new ArrayList<Forma>();

		ds1.add(forma1);
		ds1.add(forma2);

		ds2.add(forma3);
		ds2.add(forma4);

		Desenho desenho1 = new Desenho(ds1);
		Desenho desenho2 = new Desenho(ds2);

		desenhos.add(desenho1);
		desenhos.add(desenho2);
		
		for(Desenho desenho : desenhos) {

			for (Forma forma : desenho.getFormas()) {
				try {
					System.out.print("Area do "+forma.getClass().getSimpleName()+": "+forma.calcularArea()+"\n");
				} catch (ValorNegativo e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.println("Area total: " + desenho.calcularAreaTotal()+"\n");
		}
		System.out.println("Area total dos desenhos: "+(desenho1.calcularAreaTotal()+desenho2.calcularAreaTotal())+"\n");
		System.out.println("\nSomente Objeto Triangulo\n");

		for(Desenho desenho : desenhos) {
			for (Forma forma : desenho.getFormas()) {
				if(forma.getClass() == Triangulo.class) {
					try {
						System.out.print("Area do "+forma.getClass().getSimpleName()+": "+forma.calcularArea()+"\n");
					} catch (ValorNegativo e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}


	}
}


