package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro nome: ");
        String firstName = scanner.nextLine();

        System.out.print("Digite o segundo nome: ");
        String secondName = scanner.nextLine();

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(100);

        System.out.printf("Olá mundo, meu nome é %s %s e meu número aleatório é %d%n", firstName, secondName, randomNumber);
    }
}