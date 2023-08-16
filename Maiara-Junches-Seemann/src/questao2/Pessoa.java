package questao2;

public class Pessoa {

	private String nome;
    private String email;
    private String telefone;
    private Endereco endereco;
    
    public Pessoa(String nome, String email, String telefone, Endereco endereco) {
    	
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
