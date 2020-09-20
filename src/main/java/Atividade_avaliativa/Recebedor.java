package Atividade_avaliativa;

public abstract class Recebedor {

	private Entrega entrega;

    public Recebedor(Entrega endereco) {
		this.entrega = endereco;
	}

	public Recebedor () {

	}

    private String telefone;
    private String email;
    private Entrega endereco;
    private String assinatura;
    private String nome;

	public String getTelefone() {
		return telefone;
    }
    
	public Entrega getEndereco() {
		return endereco;
    }
    
	public String getAssinatura() {
		return assinatura;
    }

	public String getNome() {
		return nome;
    }

	public void setEndereco(Entrega endereco) {
		this.endereco = endereco;
    }
    
	public String getEmail() {
		return email;
    }
    
	public void setEmail(String email) {
		this.email = email;
    }
    
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
