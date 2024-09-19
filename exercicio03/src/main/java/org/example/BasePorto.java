package org.example;

import java.util.ArrayList;
import java.util.List;

class BasePorto {
    private String nome;
    protected List<Barco> barcosAtracados;

    public BasePorto(String nome) {
        this.nome = nome;
        this.barcosAtracados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Barco> getBarcosAtracados() {
        return barcosAtracados;
    }

    public void atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
        System.out.println("Barco " + barco.getNome() + " atracado no " + nome);
    }

    public void desatracarBarco(Barco barco) {
        barcosAtracados.remove(barco);
        System.out.println("Barco " + barco.getNome() + " desatracado do " + nome);
    }
}

