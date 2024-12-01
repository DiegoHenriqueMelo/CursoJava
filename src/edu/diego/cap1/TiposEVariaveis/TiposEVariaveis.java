package edu.diego.cap1.TiposEVariaveis;

public class TiposEVariaveis {

    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2024;
        int cep = 21070333;
        long cpf = 44405647809L;
        float pi = 3.14F;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; //! ERROR
        short numeroCurto2 = (short) numeroNormal;

        int num = 2;

        System.out.print(num);

        num = 1;

        System.out.print(num);

        final int NUMERO = 4;

        System.out.print(NUMERO);


        String nomeCompleto = "Diego Melo";

        final String PRIMEIRO_NOME ="Diego";

        // PRIMEIRO_NOME = "Roberto"; //! ERROR


        //NUMERO = 2; //! ERROR
    }

}
