package main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {
	
	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if(valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcion�rio com sal�rio maior que R$10000 n�o pode receber bonus.");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}