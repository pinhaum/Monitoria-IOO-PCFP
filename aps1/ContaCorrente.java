package aps1;

public class ContaCorrente {
	public int numero;
	
	public ContaCorrente () {
	
	}	
	
	public int verificador(int numero) {		

		int centena = numero / 100;
		int dezena = (numero % 100) / 10;
		int unidade = numero % 10;
		int invertido = (unidade * 100) + (dezena * 10) + centena;
				
		int  verificador = this.numero + invertido;	
		
		verificador = (verificador / 100 ) * 1 + ((verificador % 100) / 10) * 2 + (verificador % 10) * 3;
		
		verificador %= 10;		
		
		return verificador;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
