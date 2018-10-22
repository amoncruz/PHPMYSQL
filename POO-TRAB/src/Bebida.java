
public class Bebida extends ItemCardapio{
	
private int qtd;
	
public Bebida(String nome, double preco) {
		super(nome, preco);
	}
public void Estocar(int qtd){
	this.qtd=qtd;
}
void diminuirDoEstoque(int qtd){
	if(estoque_vazio()){
		System.out.println("estoque vazio");
		return;
	}
	this.qtd=this.qtd-qtd;
}
boolean estoque_vazio(){
	if(this.qtd==0){
	return true;
	}else{
		return false;
	}
}
int getEstoque(){
	return this.qtd;
}

}
