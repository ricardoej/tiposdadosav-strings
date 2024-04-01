package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {
	

public int getNumeroVogais(String texto) {
	int qtdVogais=0;
	texto = texto.toLowerCase();
	for(int i=0;i<texto.length();i++) {
		char c = texto.charAt(i);
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			qtdVogais++;
		}
	}
	return qtdVogais;
}


public int getNumeroConsoantes(String texto) {
	int qtdConsoante=0;
	texto = texto.toLowerCase();
	for(int i=0;i<texto.length();i++) {
		char c = texto.charAt(i);
		if(c >='a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
			qtdConsoante++;
		}
	}
	return qtdConsoante;
	
}

public boolean getIsAnagrama(String valor1, String valor2) {
	char[] str1 = valor1.toCharArray();
	char[] str2 = valor2.toCharArray();
	Arrays.sort(str1);
	Arrays.sort(str2);
	
	return Arrays.equals(str1, str2);
	
}



}


