package unidad4;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Introduzca texto:");
String texto = in.next();

while (texto.length() < 1){
	System.out.println("Edebe introducir texto:");
	texto = in.nextLine();
} // while

int vocalA = 0;
int vocalE = 0;
int vocalI = 0;
int vocalO =0;
int vocalU = 0;

String textoMayus = texto.toUpperCase();

for (int indice = 0; indice < textoMayus.length(); indice++) {
	switch (textoMayus.charAt(indice)) {
	case 'A': vocalA++; break;
	case 'E': vocalE++; break;
	case 'I': vocalI++; break;
	case 'O': vocalO++; break;
	case 'U': vocalU++; break;
	} // switch
} // for
System.out.println("En su texto la 'a' aparece " + vocalA + " veces, " + "la 'e', " + vocalE + " veces, la 'i', " + vocalI + " veces, la 'o', " + vocalO + " veces, y la 'u', " + vocalU + " veces.");
	} // main

}
