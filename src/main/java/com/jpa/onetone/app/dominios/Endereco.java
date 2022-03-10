package com.jpa.onetone.app.dominios;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity 
public class Endereco {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_rua;
    private String rua;
    private String cidade;
    private Integer numero;
    private String bairro;
    private String estado;


    public Endereco() {
    }

    public Endereco(Integer id_rua, String rua, String cidade, Integer numero, String bairro, String estado) {
        this.id_rua = id_rua;
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
    }

    public Integer getId_rua() {
        return this.id_rua;
    }

    public void setId_rua(Integer id_rua) {
        this.id_rua = id_rua;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Endereco id_rua(Integer id_rua) {
        setId_rua(id_rua);
        return this;
    }

    public Endereco rua(String rua) {
        setRua(rua);
        return this;
    }

    public Endereco cidade(String cidade) {
        setCidade(cidade);
        return this;
    }

    public Endereco numero(Integer numero) {
        setNumero(numero);
        return this;
    }

    public Endereco bairro(String bairro) {
        setBairro(bairro);
        return this;
    }

    public Endereco estado(String estado) {
        setEstado(estado);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Endereco)) {
            return false;
        }
        Endereco endereco = (Endereco) o;
        return Objects.equals(id_rua, endereco.id_rua) && Objects.equals(rua, endereco.rua) && Objects.equals(cidade, endereco.cidade) && Objects.equals(numero, endereco.numero) && Objects.equals(bairro, endereco.bairro) && Objects.equals(estado, endereco.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_rua, rua, cidade, numero, bairro, estado);
    }

    @Override
    public String toString() {
        return "{" +
            " id_rua='" + getId_rua() + "'" +
            ", rua='" + getRua() + "'" +
            ", cidade='" + getCidade() + "'" +
            ", numero='" + getNumero() + "'" +
            ", bairro='" + getBairro() + "'" +
            ", estado='" + getEstado() + "'" +
            "}";
    }

}
