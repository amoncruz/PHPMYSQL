package doispontos;

public class Main {

	public static void main(String[] args) {
		/*Pilha p1= new Pilha(4);
		Fila f=new Fila(4);
		f.enfileirar(3);
		f.enfileirar(4);
		f.enfileirar(9);
		f.enfileirar(4);
		inverter(f, p1);
	*/
	Lista l= new Lista(20);
	l.adicionar_inicio(4);
l.adicionar_inicio(2);
l.adicionar_inicio(12);
l.adicionar_inicio(15);
l.adicionar_inicio(13);
l.remover_posicao(1);
l.mostrar();

	}
	public static void inverter(Fila f,Pilha p1){
		System.out.println("Fila");
		f.mostrar();
		System.out.println("--------------------");
		for(int i=0;i<4;i++){
			int aux=f.desenfileirar();
			p1.empilhar(aux);
		}
		System.out.println("Pilha");
		p1.mostrar();
		System.out.println("--------------------");
		for(int x=0;x<4;x++){
			int aux;
			aux=p1.desempilhar();
			f.enfileirar(aux);
		}
		System.out.println("Fila");
		f.mostrar();
		System.out.println("--------------------");
		System.out.println("Pilha");
		p1.mostrar();
	}

	

}

