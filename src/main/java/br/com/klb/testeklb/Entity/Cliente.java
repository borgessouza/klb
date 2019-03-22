package br.com.klb.testeklb.Entity;

import br.com.klb.testeklb.Utils.TipoRisco;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nomeCliente;
    @Column(nullable = false)
    private Double limiteCredito;
    @Column(nullable = false)
    private Double taxaJuros;
    @Enumerated(EnumType.STRING)
    private TipoRisco tipoRisco;

    public Cliente() {
    }

    public Cliente(String nomeCliente, Double limiteCredito, Double taxaJuros, TipoRisco tipoRisco) {
        this.nomeCliente = nomeCliente;
        this.limiteCredito = limiteCredito;
        this.taxaJuros = taxaJuros;
        this.tipoRisco = tipoRisco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public TipoRisco getTipoRisco() {
        return tipoRisco;
    }

    public void setTipoRisco(TipoRisco tipoRisco) {
        this.tipoRisco = tipoRisco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) &&
                Objects.equals(nomeCliente, cliente.nomeCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeCliente);
    }
}
