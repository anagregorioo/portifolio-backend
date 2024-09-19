package org.example;

public class Main {
    public static void main(String[] args) {
        Barco[] barcos = {
                new Barco("Barco 1", 2),
                new Barco("Barco 2", 5),
                new Barco("Barco 3", 7),
                new Barco("Barco 4", 12),
                new Barco("Barco 5", 28)
        };

        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno");
        PortoGrande portoGrande = new PortoGrande("Porto Grande");

        for (Barco barco : barcos) {
            if (barco.getTamanho() <= 10) {
                portoPequeno.atracarBarco(barco);
            } else {
                portoGrande.atracarBarco(barco);
            }
        }
    }
}