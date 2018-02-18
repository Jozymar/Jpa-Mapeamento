package com.ifpb.edu.br.mapeamento;

import com.ifpb.edu.br.mapeamento.Telefone;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-05T06:40:40")
@StaticMetamodel(Contato.class)
public class Contato_ { 

    public static volatile ListAttribute<Contato, String> emails;
    public static volatile SingularAttribute<Contato, Date> dataDaCriacao;
    public static volatile SingularAttribute<Contato, String> apelido;
    public static volatile SingularAttribute<Contato, byte[]> foto;
    public static volatile SingularAttribute<Contato, String> nome;
    public static volatile SingularAttribute<Contato, Integer> id;
    public static volatile SingularAttribute<Contato, String> sobrenome;
    public static volatile ListAttribute<Contato, Telefone> telefones;
    public static volatile SingularAttribute<Contato, String> descricao;

}