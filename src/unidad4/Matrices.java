package unidad4;

public class Matrices {
	
	static int [][] cuadrada1(int dim) {
		int [] numeros = new int [dim*dim];
		for (int i=0; i<numeros.length; i++)
			numeros[i] = i+1;
			return rellenaMatriz(numeros, dim);
	} // cuadrada1
	
	static void imprime(int [][] matriz) {
		for (int i=0; i<matriz.length; i++) {
			System.out.println();
			for (int j=0; j<matriz[i].length; j++) {
				System.out.printf("%2d ", matriz[i][j]);
			} // for j
		} // for i
		System.out.println();
	} // imprimeMatriz

	static int [][] cuadrada2(int dim) {
		int [] numeros = new int[dim*dim];
		for (int i=1; i<=(dim*dim); i++) {
			if (i <= dim)
			numeros[i-1] = i;
			if (i>dim && i <= (dim*2))
				numeros[(dim*3)-i] = i;
			if (i > (dim*2) && i <= (dim*3))
				numeros[i-1] = i;
			if (i > (dim*3))
				numeros[(dim*7)-i] = i;
		} // for

			return rellenaMatriz(numeros, dim);
	} // cuadrada2

	static int [][] rellenaMatriz(int [] numeros, int dim) {
		int [][] matriz = new int[dim][dim];
		int cuentaNumeros = 0;
		for (int i=0; i<dim; i++) {
			for (int j=0; j<dim; j++)
			matriz[j][i] = numeros[cuentaNumeros++];
		} // for i
		return matriz;
	} // rellenaMatriz

	static String [][] palindromos(int c, int f) {
		if (f>=1 && f<=26 && c>=1 && c<=26) {
			String abecedario = "abcdefghijklmnopqrstuvwxyz";
			char [] letras = new char[3];
			String [][] matriz = new String[f][c];
			for (int i=0; i<matriz.length; i++) {
				for (int j=0; j<matriz[i].length; j++) {
					letras[0] = abecedario.charAt(i);
					letras[1] = abecedario.charAt(i+j);
					letras[2] = abecedario.charAt(i);
					matriz[i][j] = new String(letras);
				} // for j
			} // for i
			return matriz;
		} else return null;
		} // palindromos

}
