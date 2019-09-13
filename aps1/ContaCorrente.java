package aps1;

public class ContaCorrente {
	public int numero;
	
	
	public ContaCorrente () {
	
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
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
