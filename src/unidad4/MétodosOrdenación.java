package unidad4;

import java.util.Random;

public class MétodosOrdenación {

	public static void main(String[] args) {
		Random r = new Random();
		int [] vector = new int [10];
		
		rellena(vector, r);
		inserccionDirecta(vector);
		rellena(vector, r);
		seleccionDirecta(vector);
		rellena(vector, r);
		intercambioDirecto(vector);
	} // main
	
	static void rellena(int[] vector, Random r) {
		for (int i = 0; i < vector.length; i++)
			vector[i] = r.nextInt(10)+1;
		System.out.print("Nuevo vector: ");
		imprimir(vector);
	} // rellena
	
	static void imprimir(int [] vector) {
		for (int num: vector)
			System.out.print(num + " ");
		System.out.println();
	} // imprimir
	
	static void inserccionDirecta(int [] vector) {
		int j, aux;
		
		for (int i = 1; i < vector.length; i++) {
			aux = vector[i];
			j = i-1;
			while ((j>=0) && (aux < vector[j])){
				vector[j+1] = vector[j];
				j--;
			} // while
			vector[j+1] = aux;
		} // for i
		System.out.print("Ordenación por insercción directa: ");
		imprimir(vector);
	} // inserccionDirecta

	static void seleccionDirecta(int [] v) {
		for (int i = 0; i < v.length-1; i++) {
			int min = i;
			for (int j = i+1; j < v.length; j++) {
				if (v[j] < v[min])
					min = j;
			} // for j
			if (i != min) {
				int aux = v[i];
				v[i] = v[min];
				v[min] = aux;
			} // if
		} // for i
		System.out.print("Ordenación por selección directa: ");
		imprimir(v);
	} // seleccionDirecta

	static void intercambioDirecto(int[] v) {
		int aux;
		for (int i=1; i<v.length; i++) {
			for (int j=v.length-1; j>=i; j--) {
				if(v[j] < v[j-1]){
					aux = v[j];
					v[j] = v[j-1];
					v[j-1] = aux;
				} // if
			} // for j
		} // for i
		System.out.print("Ordenación por intercambio directo: ");
		imprimir(v);
	} // intercambioDirecto
}
