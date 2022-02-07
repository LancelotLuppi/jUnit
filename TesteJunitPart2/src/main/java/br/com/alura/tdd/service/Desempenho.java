package main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;

public enum Desempenho {
	MEDIO {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.03");
		}
	},
	BOM {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.15");
		}
	},
	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.2");
		}
	};
	
	public abstract BigDecimal percentualReajuste();

}
