package doispontos;

import java.util.Arrays;

public class Lista {
private	int[] lista;
private int num_elementos;
	
	public Lista(int t){
		this.lista= new int[t];
		this.num_elementos=0;
	}
	boolean lista_vazia(){
		if(num_elementos==0){
		return true;
		}else{
			return false;
		}
	}
	 boolean lista_cheia(){
		if(num_elementos>=lista.length){
		return true;
		}else{
			return false;
		}
	}
	 int getQuantidade(){
			System.out.println(num_elementos);
			return this.num_elementos;
		}
	 
	public void adicionar_final(int elemento){
		if(lista_cheia()){
			System.out.println("Lista cheia zé");
		}else{
			int indice=this.num_elementos;
			this.lista[indice]=elemento;
			this.num_elementos=this.num_elementos+1;
		}

	}

	int removerfinal(){
		int numero_removido=lista[this.num_elementos-1];
		if(lista_vazia()){
			System.out.println("lista vazia");
		}else{
			lista[num_elementos-1]=0;
		}
		this.num_elementos=this.num_elementos-1;
		return numero_removido;
		
	}
		void adicionar_inicio(int e){
			if(lista_cheia()){
				System.out.println("lista cheia");
			}else{
				for(int i=0;i<this.num_elementos;i++){
					int aux;
					aux=lista[i+1];
					lista[i+1]=lista[0];
					lista[0]=aux;
					
				
				}
				this.lista[0]=e;
				this.num_elementos=this.num_elementos+1;
		
	
		}
		
}
		int remover_inicio(){
			final int numero_removido=lista[0];
		
			if(lista_vazia()){
				System.out.println("erro lista vazia");
				
			}else{
				
				int ultimo_elemento=this.num_elementos;
			for(int i =ultimo_elemento;i>0;i--){
				
					int aux;
					aux=lista[i-1];
					lista[i-1]=lista[ultimo_elemento];
					lista[ultimo_elemento]=aux;
				}
				lista[ultimo_elemento]=0;
					
			}
			this.num_elementos=this.num_elementos-1;
			
			return numero_removido;
			
		}
		void adcionar_posicao(int posic,int e){
			if(lista_cheia()){
				System.out.println("erro lista cheia");
			}else{
			for(int i=posic;i<this.num_elementos;i++){
				int aux;
				aux=lista[i+1];
				lista[i+1]=lista[posic];
				lista[posic]=aux;
				
			}
			this.lista[posic]=e;
			this.num_elementos=num_elementos+1;
			}
			
		}
		int remover_posicao(int posic){
			final int numero_removido=lista[posic];
			if(lista_vazia()){
				System.out.println("erro lista vazia");
			}else{
				
				int ultimo_elemento=this.num_elementos-1;
			for(int i =ultimo_elemento;i>posic;i--){
				
					int aux;
					aux=lista[i-1];
					lista[i-1]=lista[ultimo_elemento];
					lista[ultimo_elemento]=aux;
				}
				lista[ultimo_elemento]=0;
					
			}
			this.num_elementos=this.num_elementos-1;
			
			return numero_removido;
		}
public void mostrar(){
		for(int i=0;i<lista.length;i++){
			System.out.println(lista[i]);
		}

	
	
		
	
		}
		
		
}





