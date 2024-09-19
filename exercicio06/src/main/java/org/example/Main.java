package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        cinema.adicionarFilme(new Filme("Homem Aranha", 15.00, 12));
        cinema.adicionarFilme(new Filme("O Rei Leão", 10.00, 0));
        cinema.adicionarFilme(new Filme("Avatar", 20.00, 16));
        cinema.adicionarFilme(new Filme("Interestelar", 18.00, 14));
        cinema.adicionarFilme(new Filme("Velozes e Furiosos", 12.00, 12));

        try {
            System.out.print("Que filme você deseja assistir? (Homem Aranha, O Rei Leão, Avatar, Interestelar, Velozes e Furiosos): ");
            String nomeFilme = scanner.nextLine();
            Filme filme = cinema.buscarFilmePorNome(nomeFilme);

            if (filme == null) {
                System.out.println("Filme não encontrado.");
                return;
            }

            System.out.print("Qual assento você deseja? (Assentos disponíveis: A1 a F5): ");
            String assento = scanner.nextLine();

            System.out.print("Qual o seu nome? ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Qual a sua idade? ");
            int idade = scanner.nextInt();

            Cliente cliente = new Cliente(nomeCliente, idade);
            cinema.venderIngresso(cliente, filme, assento);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}