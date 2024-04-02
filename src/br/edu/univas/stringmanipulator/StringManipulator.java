package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {
	
	public int getNumeroVogais(String valor) {
		int totalVogal = 0;
		valor = valor.replace(" ", "");
		valor = valor.toLowerCase();
		for(int i = 0; i < valor.length(); i++) {
			if(valor.charAt(i) == 'a' || valor.charAt(i) == 'e' || valor.charAt(i) == 'i' || valor.charAt(i) == 'o' || valor.charAt(i) == 'u') {
				totalVogal++;
			}
		}
		return totalVogal;
	}
	public int getNumeroConsoantes(String valor) {
		int totalConsoantes = 0;
		valor = valor.replace(" ", "");
		valor = valor.toLowerCase();
		for(int i = 0; i <valor.length(); i++) {
			if(valor.charAt(i) != 'a' && valor.charAt(i) != 'e' && valor.charAt(i) != 'i' && valor.charAt(i) != 'o' && valor.charAt(i) != 'u' && valor.charAt(i) != '.' && valor.charAt(i) != '-') {
				totalConsoantes++;
			}
		}
		return totalConsoantes;
	}
	public boolean getIsAnagrama(String frase1, String frase2) {
		
		if(frase1.length() != frase2.length()) {
			return false; 
		}
		
		char primeiraFrase[] = frase1.toCharArray();
		char segundaFrase[] = frase2.toCharArray();
		Arrays.sort(primeiraFrase);
		Arrays.sort(segundaFrase);
		return Arrays.equals(primeiraFrase, segundaFrase);
		
	}
	
}
