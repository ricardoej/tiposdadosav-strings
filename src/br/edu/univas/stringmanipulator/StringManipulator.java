package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {
	public int getNumeroVogais(String vogais) {
	    int contVogais = 0;
	    String texto = vogais.toLowerCase(); // Convertendo a string para minusculas
	    for (int i = 0; i < texto.length(); i++) {
	        char c = texto.charAt(i);
	        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	            contVogais++;
	        }
	    }
	    return contVogais;
	}
    public int getNumeroConsoantes(String consoantes) {
        int contConsoantes = 0;
        String texto = consoantes.toLowerCase(); // Convertendo a string para minusculas
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
            	contConsoantes++;
            }
        }
        return contConsoantes;
    }
	public boolean getIsAnagrama(String valor1, String valor2) {
		char[] str1 = valor1.toCharArray();
		char[] str2 = valor2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		return Arrays.equals(str1, str2);
	}
}