package com.jpa.onetone.app.dominios;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cpf;
    private String nome;
    private String telefone;

    @OneToOne
    private Endereco fk_Endereco = new Endereco();

    public Pessoa() {
    }


    public Pessoa(Integer id, String cpf, String nome, String telefone) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa id(Integer id) {
        setId(id);
        return this;
    }

    public Pessoa cpf(String cpf) {
        setCpf(cpf);
        return this;
    }

    public Pessoa nome(String nome) {
        setNome(nome);
        return this;
    }

    public Pessoa telefone(String telefone) {
        setTelefone(telefone);
        return this;
    }

    public Endereco getFk_Endereco() {
        return this.fk_Endereco;
    }

    public void setFk_Endereco(Endereco fk_Endereco) {
        this.fk_Endereco = fk_Endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(cpf, pessoa.cpf) && Objects.equals(nome, pessoa.nome) && Objects.equals(telefone, pessoa.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf, nome, telefone);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", nome='" + getNome() + "'" +
            ", telefone='" + getTelefone() + "'" +
            "}";
    }
   

}
