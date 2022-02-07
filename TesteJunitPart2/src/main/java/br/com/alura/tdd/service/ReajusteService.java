package main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;

public class ReajusteService {

	public void concedeReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal percentual = desempenho.percentualReajuste();
		BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
		funcionario.reajustarSalario(reajuste);
	}

}
