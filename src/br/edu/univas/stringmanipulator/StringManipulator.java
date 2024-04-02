package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {

	int contarVogais = 0;
	public int getNumeroVogais(String texto) {
		texto = texto.toLowerCase();
		
		for(int i = 0; i < texto.length(); i++ ) {
			char c = texto.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				contarVogais++;
		}
		return contarVogais;
	}

	public int getNumeroConsoantes(String texto) {
		int contarConsoantes = 0;
		int eliminaEspaco = 0;
		
		for(int i = 0; i < texto.length(); i++ ) {
			char c = texto.charAt(i);
			if(c == ' ' || c == '.' || c == '-')
				eliminaEspaco++;
		}
		contarConsoantes = texto.length() - contarVogais - eliminaEspaco;
		return contarConsoantes;
	}

	public boolean getIsAnagrama(String palavra1, String palavra2) {
		char [] A = palavra1.toCharArray();
		char [] B = palavra2.toCharArray();
		boolean Verificar = false;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		palavra1 = new String(A);
		palavra2 = new String(B);
		if(palavra1.equals(palavra2))
			Verificar = true;
		return Verificar;
	}

}
