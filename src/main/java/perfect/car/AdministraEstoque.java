package perfect.car;

import java.util.ArrayList;
import java.util.List;

public class AdministraEstoque {

	List<EstoqueCar> EstoqueLista = new ArrayList<EstoqueCar>();
	EstoqueCar EstoqueCar;

	public String cadastrarCarro(String modelo, String preco, String ano, String quantidade) {
		String msg = null;
		
		if (modelo == null || preco == null || ano == null || quantidade == null) {
			msg = "Carro não cadastrado, modelo, preço, ano ou quantidade não informado";
		} else if (modelo.isBlank() || preco.isBlank() || ano.isBlank()|| quantidade.isBlank() ) {
			msg = "Carro não cadastrado, modelo, preço, ano ou quantidade em branco";
		} else {
			EstoqueCar = new EstoqueCar(modelo, preco, ano, quantidade);
			EstoqueLista.add(EstoqueCar);
			msg = "Carro cadastrado com sucesso.";
		} 

		return msg;

	}

	public String consultarCarro(String modelo, String preco, String ano, String quantidade) {
		String msg = "Modelo: " + EstoqueCar.getModelo() + " Preço: " + EstoqueCar.getPreco() + " Ano: " + EstoqueCar.getAno()
				+ " Quantidade: " + EstoqueCar.getQuantidade();

		if (modelo != EstoqueCar.getModelo()|| preco != EstoqueCar.getPreco() || ano != EstoqueCar.getAno()|| quantidade !=EstoqueCar.getQuantidade() ) {
			msg = "Modelo não encontrado";
		}

		return msg;

	}
	

}
