import java.util.Scanner;




public class Pedido {

	public Pedido(Bebida b){
		if(b instanceof Bebida){
			Scanner c = new Scanner(System.in);
			System.out.println("Digite a quantide de Bebida desejada");
			int qt=c.nextInt();
			b.diminuirDoEstoque(qt);
			System.out.println(b.getEstoque());
		}
	}

}
