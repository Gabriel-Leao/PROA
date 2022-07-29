package manzano.pag41;

import java.util.Scanner;

public class J {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = input.nextInt();
        input.close();

        if (number >= 1 && number <= 9) {
            System.out.printf("O número %d está na faixa permitida.\n", number);
        } else System.out.printf("O número %d está fora da faixa permitida.\n", number);
    }
}