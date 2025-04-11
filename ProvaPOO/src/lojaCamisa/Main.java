package lojaCamisa;

public class Main {

	public static void main(String[] args) {
		CamisaEstampada camisa = new CamisaEstampada();
		
		camisa.setCor("Amarelo");
		camisa.setPreco(100);
		camisa.setTamanho("200CM");
		camisa.setEstampa("Estampa do BackYardigans ");
		
		camisa.exibirDetalhes();
		System.out.println(camisa.calcularDesconto());
		
		
		Camisa camisa2 = new CamisaSimples();
		camisa2.setCor("Roxo");
		camisa2.setPreco(100);
		camisa2.setTamanho("180CM");
		
		camisa2.exibirDetalhes();
		System.out.println(camisa2.calcularDesconto());
	}

}
// a) A herança foi importante para simplificar e padronizar os dados e a forma que eles são usados

// b) O polimorfismo foi usado para herdar o mesmos metodos com o mesmo intuito porem que executam de formas distintas.
