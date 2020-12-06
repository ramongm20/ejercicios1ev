package unidad4;

public class PruebaMatrices {

	public static void main(String[] args) {
		Matrices.imprime(Matrices.cuadrada1(4));
		Matrices.imprime(Matrices.cuadrada2(4));
		String [][] matrizPalindroma = Matrices.palindromos(4, 27);
		if (matrizPalindroma != null) {
			for (int i=0; i<matrizPalindroma.length; i++) {
				System.out.println();
				for (int j=0; j<matrizPalindroma[i].length; j++)
					System.out.printf("%-4s", matrizPalindroma[i][j]);
			} // for i
		} else System.out.println("Las dimensiones de la matriz están fuera del rango admitido.");

	} // main

}
