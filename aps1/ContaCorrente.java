package aps1;

public class ContaCorrente {
	public int numero;
	
	
	public ContaCorrente () {
	
	}
	
	public void invertido(int numero) {
		
	}
	
	public void multiplicaSoma(int numero) {
		
	}
	
	public int verificador(int numero) {		

		int centena = numero/100;
		int dezena = (numero%100)/10;
		int unidade = (numero%100)%10;
		int invertido = (unidade*100) + (dezena*10) + centena;	
					
		int passo1 = numero + invertido;		

		int passo2 = (passo1/100 * 1) + ((passo1%100)/10 *2) + ((passo1%100)%10 *3);
		
		int passo3 = (passo2 % 10);
		
		return passo3;	
		
		/*
		int invertido = 0;
		while(numero > 0) {
			invertido *=  10; 
			invertido += (numero % 10); 
			numero /= 10;
		 
		int passo2 = 0;
		String valorString = Integer.toString(passo1);
		for(int i = 0; i < valorString.length(); i++) {
			
			int multi = (Character.getNumericValue((valorString.charAt(i))) * (i+1));			
			passo2 += multi;	
			
		int passo3 = (passo2%10);
		}*/
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}