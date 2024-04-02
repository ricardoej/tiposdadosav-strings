package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {
	
	public int getNumeroVogais(String string) {
		//contando as vogais
		int vogais = 0;
		//minha string chama string 
		//toLowercase = lendo todas as letras sem esta minuscula 
		string = string.toLowerCase();
			for(int i = 0; i < string.length();i++) {
				char letra = string.charAt(i);
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
					vogais++;			
				}
			}
			return vogais;
	}

	public int getNumeroConsoantes(String string) {
		int vogais = 0;
		string = string.toLowerCase();
		for(int i = 0; i < string.length();i++) {
			char c = string.charAt(i);
			if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o'&& c != 'u') {
				vogais++;
			}
		}
		return vogais;
	}
	public boolean getIsAnagrama(String valor1, String valor2) {
		char[] str1 = valor1.toCharArray();
		char[] str2 = valor2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		return Arrays.equals(str1,str2);
	}
}
