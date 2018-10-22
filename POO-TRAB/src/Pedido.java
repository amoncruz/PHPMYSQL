import java.util.Scanner;




public class Pedido {
	private static double total;
	private int qt;
	private boolean pago=false;
	Cliente cliente;
	public Pedido(Bebida b,Cliente cliente){
		if(b instanceof Bebida && cliente instanceof Cliente){
			Scanner c = new Scanner(System.in);
			System.out.println("Digite a quantide de Bebida desejada");
			qt=c.nextInt();
			Pedido.total+=(qt*b.getPreco());
			b.diminuirDoEstoque(qt);
			System.out.println(b.getEstoque());
			
		}
		
		
	}
	static double TotalDoPedido(Cliente cliente){
		System.out.println("Nome do cliente "+cliente.getNome()+" Total: "+Pedido.total);
	return Pedido.total;

}
	
	public Pedido(Lanche b, Cliente cliente){
		if(b instanceof Lanche && cliente instanceof Cliente){
			Pedido.total+=b.getPreco();
			
		}
		
	}
	
	public void RealizarPagamento(){
		if(!pago){
		total=0;
		this.pago=true;
		}else{
			System.out.println("Já foi pago");
		}
	}
}
