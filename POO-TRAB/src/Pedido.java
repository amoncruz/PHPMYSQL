import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Pedido {
	
	private double total;
	private int qt;
	private boolean pago=false;
	private Date data;
	Cliente cliente;
	Bebida b;
	
	public Pedido(Bebida b,Cliente cliente){
		this.cliente=cliente;
		this.b=b;
		if(b instanceof Bebida && cliente instanceof Cliente){
			@SuppressWarnings("resource")
			Scanner c = new Scanner(System.in);
			System.out.println("Digite a quantide de Bebida desejada");
			qt=c.nextInt();
			this.total+=(qt*b.getPreco());
			b.diminuirDoEstoque(qt);
			System.out.println(b.getEstoque());
			
		}	
	}
	double TotalDoPedido(Cliente cliente){
	
	System.out.println("Nome do cliente "+cliente.getNome()+" Total: "+this.total);
	return this.total;

}
	
	public Pedido(Lanche b, Cliente cliente,Bebida e,Refeicao r,Sobremesa s){
		if(e instanceof Bebida && b instanceof Lanche && cliente instanceof Cliente
				&& r instanceof Refeicao && s instanceof Sobremesa){
			@SuppressWarnings("resource")
			Scanner c = new Scanner(System.in);
			System.out.println("Digite a quantide de Bebida desejada");
			qt=c.nextInt();
			this.total+=(qt*b.getPreco());
		
		}
		
	}
	
	public void RealizarPagamento(){
		if(!pago){
		Entregador.ValorTotalDoPedido();
		Entregador.Entrega();
		total=0;
		this.pago=true;
		}else{
			System.out.println("Já foi pago");
		}
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public static void PedidoDoDia(List<Pedido> item){
		for (Pedido p : item) {
		    System.out.println(p.cliente.getNome()+" "+p.cliente.getEndereco()+""+p.TotalDoPedido(p.cliente));
		}
	}
	
	
	
	
}
