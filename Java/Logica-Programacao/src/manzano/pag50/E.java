package manzano.pag50;

import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        int i = 1;

        do {
            System.out.print("Digite um número inteiro: ");
            int number = input.nextInt();
            soma += number;
            i++;
        } while (i <= 15);

        input.close();

        System.out.printf("O somatório dos 15 números é %d.\n", soma);
    }
}