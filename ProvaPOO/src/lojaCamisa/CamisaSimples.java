package lojaCamisa;

public class CamisaSimples extends Camisa{
	
	public CamisaSimples() {
		
	}
	
	public CamisaSimples(String cor, String estampa, double preco, String tamanho) {
		super(cor, tamanho, preco);
		
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
