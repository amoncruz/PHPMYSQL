
public class Lanche extends ItemCardapio{

	public Lanche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lanche(String nome, double preco) {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPreco(){
		return this.preco;
		
	}
	@Override
	public String getNome(){
		return this.nome;
		
	}
	
}
