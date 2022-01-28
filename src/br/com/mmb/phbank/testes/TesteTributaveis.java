package br.com.mmb.phbank.testes;

import br.com.mmb.phbank.CalculadorDeImposto;
import br.com.mmb.phbank.ContaCorrente;
import br.com.mmb.phbank.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
