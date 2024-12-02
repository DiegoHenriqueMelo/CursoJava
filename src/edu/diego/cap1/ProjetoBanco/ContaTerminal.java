package edu.diego.cap1.ProjetoBanco;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner prompt = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int conta = prompt.nextInt();

        System.out.println("Digite o número da agencia: ");
        String agencia = prompt.next();

        prompt.nextLine();
        
        System.out.println("Digite o nome do Cliente");
        String nome = prompt.nextLine();

        System.out.println("Digitre o saldo da conta");
        double saldo = prompt.nextDouble();

        System.out.println(
                "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: "
                        + conta + " e seu saldo: " + saldo + " já está disponivel para saque");
    }
}
