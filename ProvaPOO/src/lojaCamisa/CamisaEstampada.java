package lojaCamisa;

public class CamisaEstampada extends Camisa {
	private String estampa;
	
	public CamisaEstampada() {
		
	}
	
	public CamisaEstampada(String estampa) {
		this.estampa = estampa;
	}
	
	public CamisaEstampada(String cor, String estampa, double preco, String tamanho) {
		super(cor, tamanho, preco);
		this.estampa = estampa;
	}
	
	public String getEstampa() {
		return estampa;
	}

	public void setEstampa(String estampa) {
		this.estampa = estampa;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Tipo da estampa " + estampa + "\nCor " + getCor() + "\nPreço R$" + getPreco() + "\nTamanho " + getTamanho());
	}

	@Override
	public double calcularDesconto() {
		double novo_preco;
		novo_preco =  getPreco() * 0.95;
		return novo_preco;
	}
	
	
	
}
