import java.util.ArrayList;
import java.util.List;


public class ItemPedido {
private int qtd;
ItemCardapio itemcardapio;



public ItemPedido(ItemCardapio itemcardapio,int qtd){
	this.qtd=qtd;
	this.itemcardapio=itemcardapio;
}



public int getQtd() {
	return qtd;
}

public void setQtd(int qtd) {
	this.qtd = qtd;
}
}
