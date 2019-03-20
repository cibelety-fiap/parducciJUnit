import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

	/** * Teste de somar na Calculadora. */

	@Test
	public void testeSomar() {
		int nro1 = 5;
		int nro2 = 5;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 10;
		int resultadoReal = calc.somar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeSubtrair() {
		int nro1 = 3;
		int nro2 = 5;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 2;
		int resultadoReal = calc.subtrair(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeMultiplicar() {
		int nro1 = 3;
		int nro2 = 5;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 15;
		int resultadoReal = calc.multiplicar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeDividir() {
		int nro1 = 3;
		int nro2 = 15;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 5;
		int resultadoReal = calc.dividir(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
