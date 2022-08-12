package perfect.car;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class EstoqueTeste {
	AdministraEstoque estoque = new AdministraEstoque();

	@Before
	public void executaAntesDoTeste () {
		estoque = new AdministraEstoque();
	}
	
	@Test
	public void cadastrarVeiculoComSucesso() {
		assertEquals("Carro cadastrado com sucesso.", estoque.cadastrarCarro("creta", "1000", "2021", "2"));
	}

	@Test
	public void cadastrarVeiculoComDadosNull() {
		assertEquals("Carro não cadastrado, modelo, preço, ano ou quantidade não informado",
				estoque.cadastrarCarro(null, "1000", null, "2"));
	}

	@Test
	public void cadastrarVeiculosEmBranco() {
		assertEquals("Carro não cadastrado, modelo, preço, ano ou quantidade em branco",
				estoque.cadastrarCarro(" ", " ", " ", " "));
	}

	@Test
	public void consultarComSucesso() {
		String modelo = "Creta";
		String preco = "1000";
		String ano = "2021";
		String quantidade = "2";
		
		estoque.cadastrarCarro(modelo, preco, ano, quantidade);
		
		assertEquals("Modelo: " + modelo + " Preço: " + preco + " Ano: " + ano + " Quantidade: " + quantidade, estoque.consultarCarro(modelo, preco, ano, quantidade));
	}

	@Test
	public void consultarInvalido () {
		String modelo = "Creta";
		String modeloInvalido = "Palio";
		String preco = "1000";
		String ano = "2021";
		String quantidade = "2";
		
		
		estoque.cadastrarCarro(modelo, preco, ano, quantidade);
		
		assertEquals("Modelo não encontrado", estoque.consultarCarro(modeloInvalido, preco, ano, quantidade));
	}
}
