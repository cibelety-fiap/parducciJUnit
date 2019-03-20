import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProdutoTeste2 {

	@Test
	public void testeGetPeso() {
		double peso = 20;
		
		Produto produto = new Produto(peso,0);
			
		double resultadoEsperado = peso; 
		double resultadoReal = produto.getPeso();
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeSetPeso() {
		double peso = 20;
		
		Produto produto = new Produto();
		
		produto.setPeso(peso);
		
		double resultadoEsperado = peso; 
		double resultadoReal = produto.getPeso();
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
