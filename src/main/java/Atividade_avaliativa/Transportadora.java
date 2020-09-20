package Atividade_avaliativa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transportadora extends Veiculo {

    public Transportadora(String cnpj, String Fantasia) {
        super(cnpj, Fantasia);
    }

    public Transportadora(String cnpj, String Fantasia, List<Veiculo> Veiculos) {
        this(cnpj, Fantasia);
        this.Veiculos = Veiculos;
    }

    private List<Veiculo> Veiculos;
    

    public List<Veiculo> getVeiculos() {
        return Veiculos;
    }

    public void setVeiculos(List<Veiculo> Veiculos) {
        this.Veiculos = Veiculos;
    }

    public void adicionarVeiculo(Veiculo Veiculo) {

        if (possuiVeiculo(Veiculo.getData()))
            throw new RuntimeException("O Transportadora " +
                this.getFantasia()  +
                " já possui o Veiculo " +
                Veiculo.getData()
            );

        if (this.Veiculos == null || this.Veiculos.isEmpty())
            this.Veiculos = new ArrayList<>(Arrays.asList(Veiculo));
        else
            this.Veiculos.add(Veiculo);
    }

    private String getFantasia() {
        return null;
    }

    public void removerVeiculo(short codigoVeiculo) {
        if (!possuiVeiculo(codigoVeiculo))
            throw new Exception("O Transportadora " 
                + this.getFantasia() 
                + " não possui o Veiculo " 
                + codigoVeiculo);
        
        this.Veiculos.removeIf(d -> d.getCodigo() == codigoVeiculo);
    }

    public boolean possuiVeiculo(short codigoVeiculo) {
        if (this.Veiculos == null || this.Veiculos.isEmpty())
            return false;

        for (Veiculo Veiculo : Veiculos)
            if (codigoVeiculo == (Veiculo.getCodigo()))
                return true;

        return false;
    }
}
