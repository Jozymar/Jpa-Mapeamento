package com.ifpb.edu.br.mapeamento;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contato implements Serializable {

    @Id
    private int id;

    private String nome;
    private String sobrenome;
    private String apelido;

    @Lob
    private String descricao;

    @ElementCollection
    @CollectionTable(name = "Emails")
    private List<String> emails;

    @Lob
    private byte[] foto;

    @Temporal(TemporalType.DATE)
    private Date dataDaCriacao;

    @ElementCollection
    @CollectionTable(name = "Telefones")
    private List<Telefone> telefones;

    public Contato() {
    }

    public Contato(String nome, String sobrenome, String apelido, String descricao, List<String> emails, byte[] foto, Date dataDaCriacao, List<Telefone> telefones) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
        this.descricao = descricao;
        this.emails = emails;
        this.foto = foto;
        this.dataDaCriacao = dataDaCriacao;
        this.telefones = telefones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(String email) {
        emails.add(email);
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Date getDataDaCriacao() {
        return dataDaCriacao;
    }

    public void setDataDaCriacao(Date dataDaCriacao) {
        this.dataDaCriacao = dataDaCriacao;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone telefone) {
        telefones.add(telefone);
    }

}
