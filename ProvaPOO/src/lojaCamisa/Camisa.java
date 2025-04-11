package lojaCamisa;

public abstract class Camisa {
	private String cor, tamanho;
	private double preco;
	
	public Camisa(){	}
	
	public Camisa(String cor, String tamanho, double preco) {
		this.cor = cor;
		this.preco = preco;
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public abstract void exibirDetalhes();
	
	public abstract double calcularDesconto();
	
	
}
