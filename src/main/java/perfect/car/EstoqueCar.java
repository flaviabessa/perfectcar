package perfect.car;

public class EstoqueCar {
	
	private String modelo;
	private String preco;
	private String ano;
	private String quantidade;
	
	public EstoqueCar (String modelo, String preco, String ano, String quantidade) {
		this.modelo = modelo;
		this.preco = preco;
		this.ano = ano;
		this.quantidade = quantidade;
		
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getPreco() {
		return preco;
	}
	
	public String getAno() {
		return ano;
	}

	public String getQuantidade() {
		return quantidade;
	}
	

	

}
