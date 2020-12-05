package unidad4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio17 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int [] v1 = new int[r.nextInt(91)+10];
		int [] v2 = new int[r.nextInt(91)+10];
		rellenaVectores(v1, r);
		rellenaVectores(v2, r);
		Arrays.sort(v1);
		Arrays.sort(v2);
				int [] v3 = new int [v1.length+v2.length];
		
		int k = 0;
		int aux = Integer.MIN_VALUE;
		int v2j = -1;
		for (int i=0; i<v1.length; i++) {
			for (int j=0; j<v2.length; j++) {
				if (v2[j]<=v1[i] && v2[j]>=aux && j>v2j) {
					v3[k] = v2[j];
					k++;
					aux = v2[j];
					v2j = j;
				} // if
			} // for j
			v3[k] = v1[i];
			aux = v1[i];
			k++;
		} // for i
		
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
		System.out.println(Arrays.toString(v3));
		
	} // main

	static void rellenaVectores(int [] v, Random r) {
		for (int i=0; i<v.length; i++) {
			v[i] = r.nextInt(10)+1;
		}
	} // rellenaVectores;
}
