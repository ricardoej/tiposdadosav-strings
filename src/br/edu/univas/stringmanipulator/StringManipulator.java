package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {

	public int getNumeroVogais(String string) {
		String fraseTudoUpper = string.toUpperCase();
		int quantidadeVogais = 0;
		
		for(int i = 0; i < string.length(); i++) {
			char letra = fraseTudoUpper.charAt(i);
			if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
				quantidadeVogais += 1;
			}
		}
		
		return quantidadeVogais;
	}

	public int getNumeroConsoantes(String string) {
		String fraseTudoUpper = string.toUpperCase();
		int quantidadeConsoantes = 0;
		
		for(int i = 0; i < string.length(); i++) {
			char letra = fraseTudoUpper.charAt(i); 
			if(letra >= 'A' && letra <= 'Z' && letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U' ) {
				quantidadeConsoantes += 1;
			}
		}
		
		return quantidadeConsoantes;
	}

	public boolean getIsAnagrama(String string, String string2) {
		char array1[] = string.toCharArray();
		char array2[] = string2.toCharArray();
		
		 Arrays.sort(array1);
		 Arrays.sort(array2);
		 
		 return Arrays.equals(array1, array2);
	}

}
