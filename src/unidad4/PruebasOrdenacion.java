package unidad4;

public class PruebasOrdenacion {
public static void main(String[] args) {
	int [] v = {3,5,1,9,0};
	for (int num: inserccionDirecta(v))
		System.out.print(num + " ");
	
	
	System.out.println(10>5 ? "si":"no");
} // main

static int [] inserccionDirecta(int [] v) {
	int aux, j;
	for (int i=1; i<v.length; i++) {
		aux = v[i];
		j = i-1;
		while (j>=0 && aux<v[j]) {
			v[j+1] = v[j];
			j--;
		}// while
		v[j+1] = aux;
	} // for i
	return v;
}
}
