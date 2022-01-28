package br.com.mmb.phbank.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.mmb.phbank.Banco;
import br.com.mmb.phbank.Conta;
import br.com.mmb.phbank.ContaCorrente;
import br.com.mmb.phbank.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
					
		Banco banco = new Banco();
		List<Conta> listaContas = new ArrayList<Conta>();
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		listaContas.add(cc);
		listaContas.add(cp);
		banco.setContas(listaContas);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		System.out.println(banco.getNome());
		System.out.println(banco.getContas());


	}

}
