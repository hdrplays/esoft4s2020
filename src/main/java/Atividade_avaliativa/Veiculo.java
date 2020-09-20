package Atividade_avaliativa;

public class Veiculo {
    
    private String modelo;
    private String tracao;
    private String tipoCarga;
    private String motorista;
    private String cnh;
    private int codigo;
    private String data;

    public Veiculo(String cnpj, String fantasia) {
	}

	public String getModelo() {
        return modelo;
    }

    public String getTracao() {
        return tracao;
    }

    public String gettipoCarga() {
        return tipoCarga;
    }

    public String getMotorista() {
        return motorista;
    }

    public String getCnh() {
        return cnh;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public void setCodigo(int codigo) {
        if (codigo < 0)
            throw new RuntimeException("Obrigatorio informar o codigo interno do veiculo");
        this.codigo = codigo;
    }

    public void setModelo(String modelo) {
        if (modelo.length() > 100)
            throw new RuntimeException("O nome do veiculo deve ser inferior a 100 caracteres");
        this.modelo = modelo;
    }    

    public void setCnh(String cnh) {
        if (cnh.length() > 11)
            throw new RuntimeException("O numero de CNH deve ser igual a 11 digitos");
        this.cnh = cnh;
    }  

}