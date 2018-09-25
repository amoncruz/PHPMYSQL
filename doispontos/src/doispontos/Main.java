package doispontos;

public class Main {

	public static void main(String[] args) {
		Fila f=new Fila(6);
		f.enfileirar(3);
		f.enfileirar(4);
		f.enfileirar(9);
		f.desenfileirar();
		
	
		
	
		Lista l = new Lista(5);
		l.adcionar_posicao(0, 2);
		l.adicionar_inicio(4);
		l.adicionar_inicio(3);
		l.adicionar_inicio(1);
		l.adicionar_inicio(7);
		l.remover_posicao(2);
		l.mostrar();
		
		
		
	

		
		Pilha p= new Pilha(4);
		p.empilhar(6);
		p.empilhar(4);
	
	}

}