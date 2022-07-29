package manzano.pag46;

import java.util.Scanner;

public class I {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        int i = 1;

        while (i <= 10) {
            System.out.print("Digite um número inteiro: ");
            int n = input.nextInt();
            soma = soma + n;
            i++;
        }

        input.close();

        float media = (float) soma / 10;

        System.out.printf("A soma dos números digitados é %d e a média dos números é igual a %.1f.\n", soma, media);
    }
}