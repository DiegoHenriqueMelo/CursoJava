package edu.diego.cap1.Operadores;

public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "3";

        concatenacao = 11 + 1 + 1 + "1";

        System.out.print(concatenacao);

        concatenacao = 11 + 1 - 1 + "1";

        System.out.print(concatenacao);

        concatenacao = 11 + 1 * 6 - 1 + "1";

        System.out.print(concatenacao);
        
        concatenacao = 11 + 1 / 6 - 1 + "1";

        System.out.print(concatenacao);
        concatenacao = 11 + 1 / (6 - 144) + "1";

        System.out.print(concatenacao);
    }
}
