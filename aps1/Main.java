package aps1;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.setNumero(235);
		
		System.out.println(conta.verificador(conta.getNumero()));
		
		

	}

}
