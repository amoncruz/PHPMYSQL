import java.util.ArrayList;
import java.util.List;


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

public static void MostrarCardapio(List<ItemCardapio> item){
	 for(int i=0; i<item.size(); i++){   
         System.out.println(((ItemCardapio) item.get(i)).getNome() + " " + ((ItemCardapio) item.get(i)).getPreco());   
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
