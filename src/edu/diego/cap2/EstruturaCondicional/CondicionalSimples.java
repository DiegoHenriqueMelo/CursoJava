package edu.diego.cap2.EstruturaCondicional;

public class CondicionalSimples {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 170.0;

        if (valorSolicitado < saldo) {
        saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);

        double nota = 7.0;

        if (nota >= 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        if(nota > 7){
            System.out.println("APROVADO");
        }else if(nota < 7 && nota > 4){
            System.out.println("RECUPERAÇÃO");
        }else{
            System.out.println("REPROVADO");
        }

        String resultado  = nota >=7 ? "APROVADO" : "REPROVADO";

        System.out.println(resultado);

    }

}
