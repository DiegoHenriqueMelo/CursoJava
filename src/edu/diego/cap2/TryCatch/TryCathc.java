package edu.diego.cap2.TryCatch;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TryCathc {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome: ");
            String nome = prompt.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = prompt.next();

            System.out.println("Digite sua idade: ");
            int idade = prompt.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = prompt.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Os campos idades e alturam devem ser numéricos");
        }

    }
}
