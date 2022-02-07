package test.java.br.com.alura.tdd.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.br.com.alura.tdd.service.Desempenho;
import main.java.br.com.alura.tdd.service.Funcionario;
import main.java.br.com.alura.tdd.service.ReajusteService;

public class ReajusteServiceTest {
	
	private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeEach
	public void inicializar() {
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("2000"));
	}

	@Test
	public void reajusteTresPorcentoDesempenhoMedio() {
		service.concedeReajuste(funcionario, Desempenho.MEDIO);
		assertEquals(new BigDecimal("2060.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteQuinzePorcentoDesempenhoBom() {
		service.concedeReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("2300.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteVintePorcentoDesempenhoOtimo() {
		service.concedeReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("2400.00"), funcionario.getSalario());
	}
	
}
