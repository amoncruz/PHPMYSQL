
public class ItemCardapio {
protected String nome;
protected double preco;


public ItemCardapio(String nome, double preco) {
	super();
	this.nome = nome;
	this.preco = preco;
}
public ItemCardapio(){
	
}
void inserirNoCardapio(Bebida b){
if(b instanceof Bebida){
	ItemCardapio item= new ItemCardapio(b.getNome(),b.getPreco());
	System.out.println("inserido com sucesso");
}
}
void MostrarCardapio(ItemCardapio item){
	for(int i=0;i<2;i++){
		
	}
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public double getPreco() {
	return preco;
}


public void setPreco(double preco) {
	this.preco = preco;
}



}
