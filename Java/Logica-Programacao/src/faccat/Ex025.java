package faccat;

import java.util.Scanner;

public class Ex025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int conta = sc.nextInt();
        System.out.print("Digite o saldo: R$");
        float saldo = sc.nextFloat();
        System.out.print("Digite o débito: R$");
        float debito = sc.nextFloat();
        System.out.print("Digite o crédito: R$");
        float credito = sc.nextFloat();
        sc.close();

        float saldoAtual = saldo - (debito + credito);

        if (saldoAtual >= 0) {
            System.out.printf("O cliente com o número da conta %d, tem o saldo de R$%.2f. Seu saldo é positivo!\n",
                    conta, saldoAtual);
        } else System.out.printf("O cliente com o número da conta %d, tem o saldo de R$%.2f. Seu saldo é negativo!\n",
                conta, saldoAtual);
    }
}