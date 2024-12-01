package edu.diego.cap1.AnatomiaDeClasses;

public class MinhaClases {

    public static void main(String[] args) {
        final String BR = "Brasil";
        int ano = 2023;
        ano = 2024;
        int ano_2000 = 2000;

        System.out.print(BR);
        System.out.print(ano);
        System.out.print(ano_2000);

        String meuNome = "Diego Melo";
        int anoFabricacao = 2022;

        boolean verdadeira = true;
        anoFabricacao = 2018;

        String primeiroNome = "Diego";
        String segundoNome = "Henrique";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundodNome) {
        return "Resultado do método: " + primeiroNome.concat("").concat(segundodNome);
    }

}
