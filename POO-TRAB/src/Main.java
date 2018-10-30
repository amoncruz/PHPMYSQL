import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		List<ItemCardapio> item= new ArrayList<ItemCardapio>();
		
		
		Bebida coca= new Bebida("coca",3.95);
		Bebida cerveja= new Bebida("cerveja",5.15);
		Lanche salgado= new Lanche("salgado",2.65);
		
		coca.Estocar(20);
		System.out.println(coca.getEstoque());
		cerveja.Estocar(30);
		System.out.println(cerveja.getEstoque());
		item.add(coca);
		item.add(cerveja);
		item.add(salgado);
		
		Cliente amon =new Cliente("amon",88477246,"rua c 900","motel");
		Cliente felipe =new Cliente("felipe",88477246,"rua c 900","motel");
		 
		
		ItemPedido p = new ItemPedido(coca,3);
		ItemPedido p31= new ItemPedido(cerveja,4);
		ItemPedido p200= new ItemPedido(coca,4);
		Pedido p25 = new Pedido(p,amon);
		Pedido p24= new Pedido(p31,p200,felipe);
		Entregador e= new Entregador("Lucas","32baj");
		Entregador e2= new Entregador("Moises","1dafg");
			e.Entrega(p24);
			e.Entrega(p25);
		amon.cancelarPedido(p25);
		e.PedidoDoDia();
		
	


		  
		
	}
	
	

}
