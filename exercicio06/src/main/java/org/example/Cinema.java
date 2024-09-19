package org.example;

import java.util.ArrayList;
import java.util.List;

class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<Ingresso> ingressosVendidos;
    private List<String> assentosDisponiveis;

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        ingressosVendidos = new ArrayList<>();
        assentosDisponiveis = new ArrayList<>();
        inicializarAssentos();
    }

    private void inicializarAssentos() {
        char[] filas = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char fila : filas) {
            for (int i = 1; i <= 5; i++) {
                assentosDisponiveis.add(fila + String.valueOf(i));
            }
        }
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilmePorNome(String nome) {
        return filmesDisponiveis.stream()
                .filter(filme -> filme.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    public void venderIngresso(Cliente cliente, Filme filme, String assento) throws Exception {
        if (!assentosDisponiveis.contains(assento)) {
            throw new Exception("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
        }

        if (cliente.getIdade() < filme.getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }

        Ingresso ingresso = new Ingresso(cliente, filme, assento);
        ingressosVendidos.add(ingresso);
        assentosDisponiveis.remove(assento);
        System.out.println(ingresso);
    }
}
