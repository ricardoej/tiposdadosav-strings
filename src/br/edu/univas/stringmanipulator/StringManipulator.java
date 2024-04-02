package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {
	

	public int getNumeroVogais(String valor) {
		int vogais = 0;
		
		valor = valor.toLowerCase();
		
		for(int i = 0; i < valor.length(); i++) {
			char c = valor.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vogais ++;
			}	
		}

		return vogais;
	}

	public int getNumeroConsoantes(String valor) {
		int consoantes = 0;
		
		valor = valor.toLowerCase();
		
		for(int i = 0; i < valor.length(); i++) {
			char c = valor.charAt(i);
			if(c >= 'a' && c <='z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				consoantes ++;
			}	
		
		}
		

		return consoantes;
	}

	public boolean getIsAnagrama(String string, String string2) {

		char[] palavra1 = string.toCharArray();
		char[] palavra2 = string2.toCharArray();
		Arrays.sort(palavra1);
		Arrays.sort(palavra2);
		
		return Arrays.equals(palavra1, palavra2);
	}

}
