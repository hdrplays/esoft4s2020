package Atividade_avaliativa;

public class Coleta {

    public Coleta(String cep, String estado, String municipio) {
        this.cep = cep;
        this.estado = estado;
        this.municipio = municipio;
    }

    private String cep;
    private String estado;
    private String municipio;
    private String bairro;
    private String logradouro;
    private Short numero;
    private String complemento;
    private String volume;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Short getNumero() {
        return numero;
    }

    public void setNumero(Short numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getVolume() {
        return volume;
    }

}
