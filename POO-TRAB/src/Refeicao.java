
public class Refeicao extends ItemCardapio {

	
	public Refeicao(String nome, double preco) {
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
