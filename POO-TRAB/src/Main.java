import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		List<ItemCardapio> item= new ArrayList<ItemCardapio>();
		
		List<Pedido> itemp = new ArrayList<Pedido>();
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
		
	
		Pedido p = new Pedido(coca,amon);
		itemp.add(p);
		Pedido b= new Pedido(cerveja,felipe);
		itemp.add(b);
		ItemCardapio.MostrarCardapio(item);
		Pedido.PedidoDoDia(itemp);
		  
		
	}
	
	

}
