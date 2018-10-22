import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<ItemCardapio> item= new ArrayList();
		Bebida coca= new Bebida("coca",3.95);
		Bebida cerveja= new Bebida("cerveja",5.15);
		coca.Estocar(20);
		System.out.println(coca.getEstoque());
		cerveja.Estocar(30);
		System.out.println(cerveja.getEstoque());
		item.add(coca);
		item.add(cerveja);
		Pedido p = new Pedido(coca);
		
		
			ItemCardapio.MostrarCardapio(item);
		
		  
		
	}
	
	

}
