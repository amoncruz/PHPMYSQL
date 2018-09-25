package doispontos;

public class Pilha {
	private int[] pilha;
	private int num_elementos;

	public Pilha(int t){
		this.pilha=new int[t];
		this.num_elementos=0;
	}

int getQuantidade(){
	System.out.println(num_elementos);
	return this.num_elementos;
}


boolean pilha_vazia(){
	if(num_elementos==0){
	return true;
	}else{
		return false;
	}
}
	 boolean pilha_cheia(){
		if(num_elementos>=pilha.length-1){
		return true;
		}else{
			return false;
		}
	
	 }
	 int retornarElemento(){
			return pilha[num_elementos-1]; 
		}
	 void empilhar(int e){
			if(pilha_cheia()){
				System.out.println("lista cheia");
			}else{
				int indice=this.num_elementos;
				this.pilha[indice]=e;
				this.num_elementos=num_elementos+1;
					
				
				}
				
		
		}
	 public void mostrar(){
			for(int i=0;i<pilha.length;i++){
				System.out.println(pilha[i]);
			}
	}
}
