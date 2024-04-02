package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {

	public int getNumeroVogais(String vogais) {
		vogais = vogais.toLowerCase();
		int contaVogais = 0;
		for (int i = 0; i < vogais.length(); i++) {
			if(vogais.charAt(i) == 'a' || vogais.charAt(i) == 'e' || vogais.charAt(i) == 'i' || vogais.charAt(i) == 'o' || vogais.charAt(i) == 'u') {
				contaVogais += 1;
			}
		}
			return contaVogais;
	}

	public int getNumeroConsoantes(String consoantes) {
		//String semEspaco = consoantes.replace(" ", "");
;		consoantes = consoantes.toLowerCase();
		int contaConsoante = 0;
		for (int i = 0; i < consoantes.length(); i++) {
			contaConsoante += 1;
			if (consoantes.charAt(i) == 'a' || consoantes.charAt(i) == 'e' || consoantes.charAt(i) == 'i' || consoantes.charAt(i) == 'o' || consoantes.charAt(i) == 'u' || consoantes.charAt(i) == ' ' || consoantes.charAt(i) == '.'  || consoantes.charAt(i) == '-' ) {
				contaConsoante -= 1;
			}
		}
		return contaConsoante;
	}

	public boolean getIsAnagrama(String string, String string2) {
		char[] array1 = string.toCharArray();
		char[] array2 = string2.toCharArray();
				
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return Arrays.equals(array1, array2);	
		} 
	}