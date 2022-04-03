package Stream.Exercicio.SistemaLoja;

public class Cliente {
	
	private String nome;
	private String telefoneCelular;
	
	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefoneCelular = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	
}
