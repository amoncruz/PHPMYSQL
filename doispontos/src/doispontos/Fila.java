package doispontos;

public class Fila {
private int[] fila;
private int[] getFila() {
	return fila;
}
public void setFila(int[] fila) {
	this.fila = fila;
}
public int getNum_elementos() {
	return num_elementos;
}
public void setNum_elementos(int num_elementos) {
	this.num_elementos = num_elementos;
}

private int num_elementos;

public Fila(int t){
	this.fila= new int[t];
	this.num_elementos=0;
}
int getQuantidade(){
	System.out.println(num_elementos);
	return this.num_elementos;
}

boolean fila_vazia(){
	if(num_elementos==0){
	return true;
	}else{
		return false;
	}
}
	 boolean fila_cheia(){
		if(num_elementos>fila.length-1){
		return true;
		}else{
			return false;
		}
	
	 }
	 int retornarElemento(){
			return fila[0]; 
		}
	 void enfileirar(int e){
			if(fila_cheia()){
				System.out.println("lista cheia");
			}else{
				int indice=this.num_elementos;
				this.fila[indice]=e;
				this.num_elementos=num_elementos+1;
					
				
				}
				
		
		}

		int desenfileirar(){
			int numero_removido=fila[0];
			if(fila_vazia()){
				System.out.println("lista vazia");
			}else{

				
				int ultimo_elemento=this.num_elementos-1;
			for(int i =ultimo_elemento;i>0;i--){
				
					int aux;
					aux=fila[i-1];
					fila[i-1]=fila[ultimo_elemento];
					fila[ultimo_elemento]=aux;
				}
				fila[ultimo_elemento]=0;
					
			
			}
			
			this.num_elementos=num_elementos-1;
			return numero_removido;
			
		}

public void mostrar(){
		for(int i=0;i<fila.length;i++){
			System.out.println(fila[i]);
		}
}
}

