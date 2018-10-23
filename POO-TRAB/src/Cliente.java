
public class Cliente {
	
	private String nomeC;
	private int telefone;
	private String Endereco;
	private String referencia;
	
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
	
	
}
