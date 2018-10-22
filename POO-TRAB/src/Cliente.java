
public class Cliente {
	
	private String nome;
	private int telefone;
	private String Endereco;
	private String referencia;
	
	public Cliente(String nome, int telefone, String endereco, String referencia) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		Endereco = endereco;
		this.referencia = referencia;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	
}
