package com.ifpb.edu.br.mapeamento;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) throws IOException {

        EntityManager em = Persistence
                .createEntityManagerFactory("persistence")
                .createEntityManager();

        List<String> emails = new ArrayList<>();

        emails.add("joao@gmail.com");
        emails.add("joaozinho@gmail.com");

        Telefone telefone = new Telefone("99999-9999", "Celular");

        List<Telefone> telefones = new ArrayList<>();
        telefones.add(telefone);

        Path path = Paths.get("/home/jozimar/NetBeansProjects/jpa-mapeamento/last.jpg");
        byte[] by = Files.readAllBytes(path);

        Contato contato = new Contato("João", "Sousa", "Joãozinho", "Amigo", emails, by, new Date(10, 12, 1997), telefones);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(contato);
        transaction.commit();

    }
}
