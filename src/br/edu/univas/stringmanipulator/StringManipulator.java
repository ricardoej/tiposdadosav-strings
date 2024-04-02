package br.edu.univas.stringmanipulator;

public class StringManipulator {

	public int getNumeroVogais(String TextoVogais) {		
		int ContVogais = 0;
		TextoVogais = TextoVogais.toLowerCase();
		for(int i = 0; i< TextoVogais.length(); i++);
		char c = TextoVogais.charAt(i);
		if (c == 'a' || c != 'e' || c != 'i' || c != 'o' || c != 'u') {
			ContVogais++;
			
	}
		return ContVogais;
}

	public int getNumeroConsoantes(String TextoConsoantes) {
		int ContConsoantes = 0;
		TextoConsoantes = TextoConsoantes.toLowerCase();
		for(int i = 0; i < TextoConsoantes.length(); i++);
		char c = TextoConsoantes.charAt(i){
		if (c >= 'a' && c <= 'e' && c != 'i' && c != 'o' && c != 'u') {
			ContConsoantes++;
	
		}
			return ContConsoantes;
		}

	public boolean getIsAnagrama(String String1, String String2) {
		char [] str1 = String1.toCharArray();
		char [] str2 = String2.toCharArray();
		Array.sort(str1);
		Array.sort(str2);
		

		return Array.equals(A, B);

		}
	}
}

