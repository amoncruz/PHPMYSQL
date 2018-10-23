
public class Entregador {
	
	private static int qtd;
	private static double totalDosPedidos;
	private String nome;
	private String placaDoVeiculo;
	Pedido pedido;
	
	public String getPlacaDoVeiculo() {
		return placaDoVeiculo;
	}
	public Entregador(String nome, String placaDoVeiculo, Pedido pedido) {
		super();
		this.nome = nome;
		this.placaDoVeiculo = placaDoVeiculo;
		this.pedido = pedido;
	}
	public static void Entrega(){
		 qtd++;
	}
	int QuantidadeDeEntrega(){
		return this.qtd;
	}
	
	static double ValorTotalDoPedido(){
		 return totalDosPedidos=Pedido.total;
		
	}
	int Comissao(){
		return 1;
	}
	
	int picoDeProcura(){
		return 1;
	}
	public String getNome() {
		return nome;
	}
	
	public Pedido getPedido() {
		return pedido;
	}

	public static double getTotalDosPedidos() {
		return totalDosPedidos;
	}

}
