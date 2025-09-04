package org.model;

public class Main {
    public static void main(String[] args) {
        // Criação do cinema, salas, filmes e sessões
        Cinema cinema = new Cinema();
        Sala sala1 = new Sala();
        Filme filme1 = new Filme();
        Sessao sessao1 = new Sessao();

        // Adicionando salas e filmes ao cinema
        cinema.adicionarSala(sala1);
        cinema.adicionarFilme(filme1);

        // Adicionando sessões à sala
        sala1.adicionarSessao(sessao1);

        // Sistema de vendas e cliente tentando comprar ingresso
        SistemaDeVenda sistemaDeVenda = new SistemaDeVenda();
        sistemaDeVenda.comprarIngresso();
    }
}
