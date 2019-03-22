package br.com.klb.testeklb.DTO;

import br.com.klb.testeklb.Utils.TipoRisco;

public class ClienteDTO {

    private String nome;

    private Double credito;

    private TipoRisco risco;

    private Double taxaJuros;

    public ClienteDTO(String nome, Double credito, TipoRisco risco) {
        this.nome = nome;
        this.credito = credito;
        this.risco = risco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public TipoRisco getRisco() {
        return risco;
    }

    public void setRisco(TipoRisco risco) {
        this.risco = risco;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
