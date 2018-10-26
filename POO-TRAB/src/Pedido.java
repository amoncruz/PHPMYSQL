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
	ItemPedido itempedido;
	ItemCardapio ic;
public Pedido(ItemPedido itempedido,Cliente cliente){
		this.cliente=cliente;
		this.itempedido=itempedido;
		if(itempedido instanceof ItemPedido && cliente instanceof Cliente){
			
			System.out.println(this.total+=(this.itempedido.getQtd()*itempedido.itemcardapio.getPreco()));
			//if(itempedido instanceof ){
			//b.diminuirDoEstoque(itempedido.getQtd());
			//System.out.println(b.getEstoque());
			
			System.out.println("--------------------");
			}
		}	
	
	
	/*public Pedido(ItemPedido p,Cliente c){
		
		this.itempedido=p;
		this.cliente=c;
		this.total=itempedido.getQtd()*itempedido.itemcardapio.getPreco();
		
	}
	*/
	double TotalDoPedido(Cliente cliente){
	
	System.out.println("Nome do cliente "+cliente.getNome()+" Total: "+this.total);
	return this.total;

}
		


	/*public Pedido(Lanche b, Cliente cliente,Bebida e,Refeicao r,Sobremesa s){
		if(e instanceof Bebida && b instanceof Lanche && cliente instanceof Cliente
				&& r instanceof Refeicao && s instanceof Sobremesa){
			@SuppressWarnings("resource")
			Scanner c = new Scanner(System.in);
			System.out.println("Digite a quantide de Bebida desejada");
			qt=c.nextInt();
			this.total+=(qt*b.getPreco());
		
		}
		
	}
	*/
	public void RealizarPagamento(){
		if(!pago){
		Entregador.ValorTotalDoPedido();
		Entregador.Entrega();
		total=0;
		//this.itempedido.itemcardapio.ItensVendidos();
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
	public void cancelarPedido(){
		if(pago){
			System.out.println("Não é possivel,conta já está paga"); 
		}else{
			b.retornarAoEstoque(qt);
		}
	}
	
	
	
	
}
