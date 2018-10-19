import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<ItemCardapio> item= new ArrayList();
		Bebida coca= new Bebida("coca",3.95);
		Bebida cerveja= new Bebida("cerveja",5.15);
		item.add(coca);
		item.add(cerveja);
		
		
		
		  for(int i=0; i<item.size(); i++){   
	            System.out.println(item.get(i).getNome() + " " + item.get(i).getPreco());   
	        }  
		
	}
	

}
