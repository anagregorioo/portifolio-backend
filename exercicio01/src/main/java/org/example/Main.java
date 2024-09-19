package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] filmes = {"Grimm", "Como perder um homem em 10 dias", "Greys Anatomy", "Dr. House"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pergunta 1: Qual sua categoria de filme favorita?");
        System.out.println("1. Romance");
        System.out.println("2. Suspense");
        String resposta1 = scanner.nextLine();

        System.out.println("Pergunta 2: Qual seu gênero favorito?");
        System.out.println("1. Drama");
        System.out.println("2. Comédia");
        String resposta2 = scanner.nextLine();

        String resultadoPrefixo = "Você deveria assistir ";

        String respostaCombinada = resposta1 + resposta2;

        switch (respostaCombinada) {
            case "12":
                System.out.println(resultadoPrefixo + filmes[0]);
                break;
            case "11":
                System.out.println(resultadoPrefixo + filmes[2]);
                break;
            case "21":
            case "22":
                System.out.println(resultadoPrefixo + filmes[3]);
                break;
            default:
                System.out.println("Infelizmente não encontramos nenhum filme que você possa assistir.");
                break;
        }
    }
}