package manzano.pag41;

import java.util.Scanner;

public class K {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = input.nextInt();
        input.close();

        if (number > 3) {
            System.out.printf("O número %d é maior que 3.\n", number);
        } else System.out.printf("O número %d é não é maior que 3.\n", number);
    }
}