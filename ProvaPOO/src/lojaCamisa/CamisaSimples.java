package lojaCamisa;

public class CamisaSimples extends Camisa{
	
	public CamisaSimples() {
		
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Cor " + getCor() + "\nPreço R$" + getPreco() + "\nTamanho da camisa " + getTamanho());
	}

	@Override
	public double calcularDesconto() {
		double novo_preco;
		novo_preco =  getPreco() * 0.90;
		return novo_preco;
	}

}
