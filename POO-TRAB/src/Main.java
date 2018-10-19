
public class Main {

	public static void main(String[] args) {
		
		Bebida coca= new Bebida("coca",3.95);
		Bebida cerveja= new Bebida("cerveja",5.15);
		ItemCardapio item= new ItemCardapio();
		item.inserirNoCardapio(coca);
		item.inserirNoCardapio(cerveja);
	}

}
