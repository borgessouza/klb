package br.com.klb.testeklb.Utils;

public enum TipoRisco {

    A(0.0),
    B(0.10),
    C(0.20);

    private Double valor;

    TipoRisco(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
