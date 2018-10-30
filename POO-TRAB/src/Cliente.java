
public class Cliente {
	
	private String nomeC;
	private int telefone;
	private String Endereco;
	private String referencia;
	private boolean pago=false;
	public Cliente(String nome, int telefone, String endereco, String referencia) {
		super();
		this.nomeC = nome;
		this.telefone = telefone;
		Endereco = endereco;
		this.referencia = referencia;
	}

	public String getNome(){
		return nomeC;
	}

	public void setNome(String nome) {
		this.nomeC = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone){
		this.telefone = telefone;
	}

	public String getEndereco(){
		return Endereco;
	}

	public void setEndereco(String endereco){
		Endereco = endereco;
	}

	public String getReferencia(){
		return referencia;
	}

	public void setReferencia(String referencia){
		this.referencia = referencia;
	}
	
	public void cancelarPedido(Pedido p){



	p.setTotal(0);
	p=null;
	System.gc();
			
		}
	
	
	public void RealizarPagamento(){
		if(!pago){
		this.pago=true;
		}else{
			System.out.println("Já foi pago");
		}
	}
	
	
}

