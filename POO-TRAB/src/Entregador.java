import java.util.ArrayList;
import java.util.List;

public class Entregador {
	int ItensVendidos;
	private  int qtd;
	private double totalDosPedidos;
	private String nome;
	private String placaDoVeiculo;
	
	List<Pedido> pedidos= new ArrayList<Pedido>();
	
	public static int total;
	
	public String getPlacaDoVeiculo() {
		return placaDoVeiculo;
	}
	public Entregador(String nome, String placaDoVeiculo) {
		super();
		this.nome = nome;
		this.placaDoVeiculo = placaDoVeiculo;
		
	}
	public  void Entrega(Pedido pedido){
		pedidos.add(pedido);
		 this.qtd++;
	}
	int QuantidadeDeEntrega(){
		return this.qtd;
	}
	
	static double ValorTotalDoPedido(){
		 return total;
		
	}
	void setValorTotalDoPeidido(int total){
		Entregador.total+=total;
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
	
	public double getTotalDosPedidos() {
		return totalDosPedidos;
	}
	public void setTotalDosPedidos(double totalDosPedidos) {
		this.totalDosPedidos = totalDosPedidos;
	}
	
	void PedidoDoDia(){
		for (Pedido pedido : pedidos){
			System.out.println(pedido.cliente.getNome()+" "+pedido.TotalDoPedido());
		}
	}
	


}
